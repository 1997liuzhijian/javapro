package test;
/*按月销售额和提成率拿工资的员工*/
public class SalesEmployee extends ColaEmployee{
    private int sale;
    private double ticheng;
    public SalesEmployee(String name,int sale,double ticheng,int month){
        super(name,month);
        this.sale=sale;
        this.ticheng=ticheng;
    }

    @Override
    public double getSalary(int month) {
        return sale*ticheng;
    }
}
