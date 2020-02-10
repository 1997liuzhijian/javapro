package test;


public class MyTest {

    public static void main(String[] args){

        /*Dog dog=new Dog();
        dog.setAge(10);
        int age = dog.getAge();
        System.out.println(age);*/

        /*1到4随机三个数多少种组合
        int[] array = {1,2,3,4};
        for(int i : array){
            for(int j : array){
                if(i!=j){
                    for(int k : array){
                        if(k!=i&&k!=j) {
                            System.out.println(i * 100 + j * 10 + k);
                        }
                    }

                }

            }

        }*/

        /*1到100偶数合
        int sum = 0;
        for(int i=0;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);*/

        /*1到100质数和
        int sum = 0;
        for (int i = 2; i <= 100; i++) {
            boolean flag=true;
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    flag=false;
                }
            }
            if (flag==true) {
                sum += i;
            }
        }
        System.out.print(sum);*/

       /* m的n次方
        int m=2;
        int n=5;
        int s=1;
        for(int i=0;i<n;i++){
            s*=m;
        }
        System.out.println(s);*/


       /*水仙花数
       int a;int b;int c;int s1;int s2;
       for(a=1;a<=9;a++){
           for(b=0;b<=9;b++){
               for(c=0;c<=9;c++){
                   s1=a*a*a+b*b*b+c*c*c;
                   s2=a*100+b*10+c;
                   if(s1==s2){
                       System.out.println(s1);
                   }
               }
           }
       }

       for(int i=100;i<=999;i++){
           int a=i/100;
           int b=i/10%10;
           int c=i%10;
           if(a*a*a+b*b*b+c*c*c==i){
               System.out.println(i);
           }
       }*/

       /*
       * 两个正整数最大公因数最小公倍数
       *
       int x=4;
       int y=6;
       int max=1;
       int min=max(x,y);
       for(int i=1;i<=x&&i<=y;i++){
           if(x%i==0&&y%i==0){
               max=i;
           }
       }
       System.out.println(max);
       for(int i=min;i<=x*y;i++){
           if(i%x==0&&i%y==0){
               min=i;
               break;
           }
       }
       System.out.println(min);*/
    }
    /*public static int max(int a,int b){
        return (a>b)?a:b;
    }*/

}
