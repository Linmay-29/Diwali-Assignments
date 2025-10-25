package com.demo.bin;

import java.io.Serializable;
import com.demo.exception.LowAttendanceException;

public class Student implements Serializable {
    private int rollno;
    private String sname;
    private String course;
    private int attendance_percentage;
    private int score;

    public Student() {
        super();
    }

    public Student(int rollno, String sname, String course, int attendance_percentage, int score) {
        super();
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        this.attendance_percentage = attendance_percentage;
        this.score = score;
    }

   
    public int getAttendance() {
        return attendance_percentage;
    }

   
    public String calculateGrade() throws LowAttendanceException {
        if (attendance_percentage < 60) {
            throw new LowAttendanceException("Attendance below 60% for " + sname);
        }

        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }

    @Override
    public String toString() {
        return "RollNo: " + rollno + ", Name: " + sname + ", Course: " + course +
               ", Attendance: " + attendance_percentage + "%, Score: " + score;
    }
}
