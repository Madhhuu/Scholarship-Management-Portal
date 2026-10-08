package com.scholarship;

public class Student {

    private String studentId;
    private String name;
    private String email;
    private double cgpa;
    private double annualIncome;

    public Student(String studentId, String name, String email,
                   double cgpa, double annualIncome) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
        this.annualIncome = annualIncome;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCgpa() {
        return cgpa;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }
}