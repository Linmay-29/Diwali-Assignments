package com.demo.dao;

import java.io.*;
import java.util.*;
import com.demo.bin.Student;
import com.demo.exception.LowAttendanceException;

public class StudentDaoImpl implements StudentDao {
    static List<Student> lst;
    static {
        lst = new ArrayList<>();
        lst.add(new Student(1, "Linmay", "PG-DAC", 95, 98));
        lst.add(new Student(2, "Pranit", "PG-DAC", 94, 95));
        lst.add(new Student(3, "Hriday", "PG-DAC", 93, 94));
        lst.add(new Student(4, "Kiran", "PG-DAC", 89, 85));
        lst.add(new Student(5, "Sakshi", "PG-DAC", 45, 88));
        lst.add(new Student(6, "Riya", "PG-DAC", 55, 79));
        lst.add(new Student(7, "Tina", "PG-DAC", 67, 73));
        lst.add(new Student(8, "Raj", "PG-DAC", 99, 91));
        lst.add(new Student(9, "Neha", "PG-DAC", 82, 76));
        lst.add(new Student(10, "Mihir", "PG-DAC", 61, 80));
    }

 
    public void saveStudentsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.txt"))) {
            for (Student s : lst) {
                oos.writeObject(s);
            }
            System.out.println("✅ Students successfully saved to file 'students.txt'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
    public void displayStudentsSorted() {
        List<Student> sortedList = new ArrayList<>(lst);
        sortedList.sort((s1, s2) -> s2.getAttendance() - s1.getAttendance());

        System.out.println("\n Students in decreasing order of attendance:");
        for (Student s : sortedList) {
            try {
                String grade = s.calculateGrade();
                System.out.println(s + " | Grade: " + grade);
            } catch (LowAttendanceException e) {
                System.out.println("Error " + e.getMessage());
            }
        }
    }
}
