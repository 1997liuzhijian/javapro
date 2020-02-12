package BookMessage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyBookMain {
    public static Mybook[] books = new Mybook[200];
    public static List<Mybook> List = new ArrayList<>();
    public static File file = new File("d:/books");
    public static void main(String[] args){
        if(!file.exists()){
            inputData(List);
            save();
        }else {
            read();
        }
        menu();
        //print(List);
        //searchName(List,"书名9");
        //deleteName(List,"书名9");
        //addBook(List);
        //print(List);
    }
    public static void menu(){
        System.out.println("输出菜单选项请选择你要进行的操作（请输入1-4中任意一个数字）：");
        System.out.println("1：查找图书（根据用户名）");
        System.out.println("2：删除图书");
        System.out.println("3：查找图书（根据书名）");
        System.out.println("4：查看所有");
        System.out.println("5：退出");
        Scanner scanner = new Scanner(System.in);
        int i= scanner.nextInt();
        switch (i){
            case 1:
                addBook(List);
                break;
            case 2:
                System.out.println("请输入要删除的书名");
                String name = scanner.next();
                deleteName(List,name);
                break;
            case 3:
                System.out.println("请输入要查看的书名");
                String searchName = scanner.next();
                searchName(List,searchName);
                break;
            case 4:
                print(List);
                break;
            default:
                System.exit(1);
                break;
        }
    }
    public static void inputData(List<Mybook> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("首次运行系统请输入初始化书籍的数量");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            Mybook mybook = new Mybook("书名"+i,Double.valueOf(Double.valueOf(i)),"出版社"+i,"作者"+i,"ISBN"+i);
            books.add(mybook);
        }
    }
    public static void print(List<Mybook> books){
        for(int i=0;i<books.size();i++){
            System.out.println(books.get(i));
        }
        menu();
    }
    public static void searchName(List<Mybook> books, String name){
        for(int i=0;i<books.size();i++){
            Mybook mybook = books.get(i);
            if(mybook.getName().equals(name)){
                System.out.println(mybook);
                menu();
                return;
            };
        }
        System.out.println("此书不存在");
        menu();
    }
    public static void deleteName(List<Mybook> books, String name){
        for(int i=0;i<books.size();i++){
            Mybook mybook = books.get(i);
            if(mybook.getName().equals(name)){
                books.remove(i);
                System.out.println("删除成功");
                save();
                menu();
                return;
            };
        }
        System.out.println("此书不存在,删除失败");
        menu();
    }
    public static void addBook(List<Mybook> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名");
        String name = scanner.next();
        System.out.println("请输入价格");
        double price = scanner.nextDouble();
        System.out.println("请输入出版社");
        String press = scanner.next();
        System.out.println("请输入作者");
        String author = scanner.next();
        System.out.println("请输入书的ISBN号");
        String bookISBN = scanner.next();
        Mybook myBook = new Mybook(name,price,press,author,bookISBN);
        books.add(myBook);
        save();
        menu();
    }
    public static void save(){
        OutputStream os = null;
        ObjectOutputStream oos = null;
        try {
            os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            oos.writeObject(List);
            oos.flush();
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(oos!=null)
                oos.close();
                if(os!=null)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static void read(){
        InputStream is = null;
        ObjectInputStream ois = null;
        try {
            is = new FileInputStream(file);
            ois = new ObjectInputStream(is);
            List = (List<Mybook>)ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(ois!=null)
                    ois.close();
                if(is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
/*
* 1 图书管理  先判断 是否持久化
2 如果已经持久化  把文件中的数据读出来作为初始数据
3 如果没有持久化 自行放置10-20个数据 然后存到硬盘
4 给每次增删改 都增加持久化
* */