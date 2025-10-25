package com.demo.test;

import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class TestStudent {
    public static void main(String[] args) {
        StudentDao sdao = new StudentDaoImpl();
        sdao.saveStudentsToFile();     
        sdao.displayStudentsSorted();  
    }
}
