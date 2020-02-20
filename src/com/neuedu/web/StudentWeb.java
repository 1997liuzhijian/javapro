package com.neuedu.web;

import com.neuedu.pojo.Student;
import com.neuedu.service.IstudentService;
import com.neuedu.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentWeb {
    IstudentService studentService = new StudentService();
    public void showmain(){
        System.out.println("--------------------");
        System.out.println("1--------------- 查询");
        System.out.println("2----------------添加");
        System.out.println("3----------------修改");
        System.out.println("4----------------删除");
        System.out.println("其他--------------退出");
        System.out.println("--------------------");
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i==1){
            query();
        }else if(i==2){
            System.out.println();
        }else if(i==3){
            System.out.println();
        }else if(i==4){
            System.out.println();
        }else {
            System.exit(0);
        }
    }
    public void query(){
        List<Student> list = studentService.query();
        for(Student student : list){
            System.out.println(student);
        }
    }
    public  void add(Scanner scanner){
        System.out.println("请输入要添加的名字");
        String Sname = scanner.next();
        System.out.println("请输入要添加的性别");
        String Ssex = scanner.next();
        System.out.println("请输入要添加的年龄");
        String Sage = scanner.next();
        System.out.println("请输入要添加的系");
        String Sdept = scanner.next();
        /*Student student = new Student(sname,ssex,sage,stept);
    */}
}
