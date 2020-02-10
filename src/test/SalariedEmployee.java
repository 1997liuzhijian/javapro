package test;
/*拿固定工资的员工*/
public  class SalariedEmployee extends ColaEmployee{
    private int salary;

    public SalariedEmployee(String name,int salary,int month){
        super(name,month);
        this.salary=salary;
    }
    @Override
    public double getSalary(int month){
        return salary;
    }
}
