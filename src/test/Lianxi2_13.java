package test;

import java.util.ArrayList;
import java.util.List;

/*

输出斐波那契数列  以 1 1 开头 后面每一位都是前两位之和
1 1 2 3 5 8 13

一个球从100米高度落下，每次落地后反弹到原高度的一半，求第10次落地后 反弹多高

一个整数 加100后是一个完全平方数 再加168也是一个完全平方数 该数是多少

n个人围坐在一个圈子里 从1开始报数 报到3的时候 离开  最后剩下的是第几个人
 */
public class Lianxi2_13 {
    public static void main(String[] args){
        System.out.println(method(3));
       // System.out.println(baoshu(1000));
    }
    public static int method(int n){
        if(n==1||n==2){
            return 1;
        }else {
            int f1=1;
            int f2=1;
            int sum;
            for (int i=3;i<=n;i++){
                sum=f1+f2;
                f1=f2;
                f2=sum;
            }
            return f2;
        }
    }
    public static int baoshu(int n){
        List<Integer> list=new ArrayList<>();
        for (int i=1;i<=n;i++){
            list.add(i);
        }
        int m=1;
        while (list.size()>1){
            if(m!=3){
                int first = list.remove(0);
                list.add(first);
                m++;
            }else {
                list.remove(0);
                m=1;
            }
        }
        return list.get(0);
    }
}
