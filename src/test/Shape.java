package test;

public abstract class Shape {
    private double area;
    private double per;
    private String color;

    public Shape(){}
    public Shape(String color) {
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public abstract double getArea();
    public abstract double getPer();
    public abstract void showAll();

}
/*
* 设计Shape表示图形类，
有面积属性area、周长属性per，颜色属性color，
有两个构造方法（一个是默认的、一个是为颜色赋值的），
还有3个抽象方法，分别是：getArea计算面积、getPer计算周长、showAll输出所有信息
设计2个子类：
Rectangle表示矩形类，增加2个属性，width表示长度、height表示宽度，重写getPer、getArea和showAll三个方法，
另外又增加一个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的）
Circle表示圆类，增加1个属性，radius表示半径，重写getPer、getArea和showAll三个方法，
另外又增加两个构造方法（为半径、颜色赋值的）

编写测试类，在main方法中，分别使用父类引用指向子类对象，声明创建一个矩形和圆的对象，并调用2个子类的showAll方法。

* */