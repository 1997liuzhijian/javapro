package test;

public class TestShape {
    public static void main(String[] args) {
        /*Rectangle rectangle = new Rectangle(10,10,"blue");
        rectangle.showAll();
        Circle circle = new Circle(10,"red");
        circle.showAll();*/
        SalariedEmployee salariedEmployee = new SalariedEmployee("张三",6000,2);
        System.out.println(salariedEmployee.getSalary(2));
        HourlyEmployee hourlyEmployee = new HourlyEmployee("name",180,30,4);
        System.out.println(hourlyEmployee.getSalary(4));
        SalesEmployee salesEmployee = new SalesEmployee("name",300000,0.05,5);
        System.out.println(salesEmployee.getSalary(5));
    }
}
