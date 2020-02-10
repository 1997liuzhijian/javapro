package test;
/*按小时拿工资的员工*/
public class HourlyEmployee extends ColaEmployee{
    private int hour;
    private int hourSalay;
    public HourlyEmployee(String name,int hour,int hourSalay,int month){
        super(name,month);
        this.hour=hour;
        this.hourSalay=hourSalay;
    }

    @Override
    public double getSalary(int month) {
        if(hour<=160){
            return hour*hourSalay;
        }else {
            return 160*hourSalay+(hour-160)*hourSalay*1.5;
        }
    }
}
