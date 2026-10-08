package com.scholarship;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(
                "S001",
                "Gayathiri",
                "gayathiri@gmail.com",
                8.5,
                250000
        );

        Scholarship scholarship = new Scholarship(
                "SCH001",
                "Merit Scholarship",
                50000,
                "Minimum CGPA 8.0"
        );

        Application application = new Application(
                "APP001",
                "SUBMITTED",
                scholarship
        );

        System.out.println("===== STUDENT DETAILS =====");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("CGPA: " + student.getCgpa());
        System.out.println("Annual Income: ₹" + student.getAnnualIncome());

        System.out.println();

        System.out.println("===== SCHOLARSHIP DETAILS =====");
        scholarship.displayScholarshipDetails();

        System.out.println();

        System.out.println("===== APPLICATION DETAILS =====");
        application.displayApplicationDetails();
    }
}