package test;

public abstract class ColaEmployee {
    public ColaEmployee(String name,int month){
        this.name=name;
        this.month=month;
    }
    private String name;
    private int month;

    public abstract double getSalary(int month);

}
/*
*创建一个抽象员工类ColaEmployee，包含如下属性和方法 属性：员工的姓名(字符串类型)；员工的生日月份(整型) 抽象方法：getSalary(int month)。
创建ColaEmployee的三个子类SalariedEmployee (拿固定工资的员工)、HourlyEmployee（拿小时工资的员工）、SalesEmployee（按月销售额和提成率拿工资的员工），
并在各类中分别覆盖父类的抽象方法getSalary()，
其中每个类中的方法实现说明如下：
SalariedEmployee类：拿固定工资的员工。参数：固定工资
HourlyEmployee：按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。参数：每小时的工资（整型），每月工作的小时数(整型)。
SalesEmployee：按月销售额和提成率拿工资的员工，参数：月销售额(整型)，提成率(浮点型)

创建一个测试类，
包含两个方法，
分别为： payWage(ColaEmployee emp,int month):计算不同类型员工某个月工资。
主方法main(String[] args)：在主方法中分别创建一个拿固定工资的员工、拿小时工资的员工、按月销售额和提成率拿工资员工的对象，并把这三个对象放入一个ColaEmployee类型数组中，然后遍历数组，分别计算这个数组中每个员工某个月的工资。



* */