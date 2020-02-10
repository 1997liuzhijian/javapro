package test;

public class Circle extends Shape{
    private double radius;
    public Circle(){}
    public Circle(double radius,String color){
        super(color);
        this.radius=radius;
    }

    public double getArea(){
        return radius*radius*3.14;
    }
    public double getPer(){
        return radius*2*3.14;
    }
    public void showAll(){
        System.out.println(getArea());
        System.out.println(getPer());
        System.out.println(getColor());
    }

}
