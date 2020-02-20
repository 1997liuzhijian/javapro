package com.neuedu.service;

import com.neuedu.pojo.Student;

import java.util.List;

public interface IstudentService {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int Sno);
    Student queryOne(int Sno);
}
