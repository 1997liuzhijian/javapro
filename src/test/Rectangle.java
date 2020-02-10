package test;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(){}
    public Rectangle(double width,double height,String color){
        super(color);
        this.height=height;
        this.width=width;
    }
    public double getArea(){
        return width*height;
    }
    public double getPer(){
        return 2*(width+height);
    }
    public void showAll(){
        System.out.println(getArea());
        System.out.println(getPer());
        System.out.println(getColor());
    }
}
