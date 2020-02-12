package BookMessage;
/*
 * 程序1 定义一个类Mybook，
 * 包括成员name（书名String）、price（价格 double）、press（出版社String）、author（作者 String）、bookISBN（书的ISBN号String），
 * 定义一个类数组mybook books[200]，
 * 编写一个函数inputData(ArrayList<Mybook> books])， n为书的数量，从键盘上输入n本书的信息，
 * 编写一个函数print(ArrayList<Mybook> books)， 输出全部书的信息。
 * 程序2 在程序1的基础上，增加查找功能，
 * 编写函数searchName(ArrayList<Mybook> books,String name)，
 * 根据书名name在数组books中查找是否存在此书，如果能找到，输出该书的详细信息，如果找不到，输出“此书不存在”。
 * 程序3 增加删除功能，编写函数deleteName(ArrayList<Mybook> books,String name)，
 * 根据书名name在数组books中查找是否存在此书，如果存在，删除该书，并提示“此书删除成功。 ”，并显示该书的详细信息。
 * 如果不存在，输出“没有此书，删除失败.”
 * 程序4 添加函数menu()，输出菜单项请选择你要进行的操作（请输入1-4中的任一个数字）：
 * 1：添加图书2：删除图书3：查找图书（根据用户名）
 * 4：退出当用户输入1-3时，分别调用输入、删除和查找函数，当用户输入4时程序结束。* */


import java.io.Serializable;

public class Mybook implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private double price;
    private String press;
    private String author;
    private String bookISBN;

    public Mybook(String name, double price, String press, String author, String bookISBN) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
        this.bookISBN = bookISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    @Override
    public String toString() {
        return "Mybook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                ", author='" + author + '\'' +
                ", bookISBN='" + bookISBN + '\'' +
                '}';
    }
}
