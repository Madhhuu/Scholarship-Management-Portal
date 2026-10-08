package com.scholarship;

public class Scholarship {

    private String scholarshipId;
    private String scholarshipName;
    private double amount;
    private String eligibilityCriteria;

    public Scholarship(String scholarshipId, String scholarshipName,
                       double amount, String eligibilityCriteria) {
        this.scholarshipId = scholarshipId;
        this.scholarshipName = scholarshipName;
        this.amount = amount;
        this.eligibilityCriteria = eligibilityCriteria;
    }

    public void displayScholarshipDetails() {
        System.out.println("Scholarship ID: " + scholarshipId);
        System.out.println("Scholarship Name: " + scholarshipName);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Eligibility: " + eligibilityCriteria);
    }

    public String getScholarshipId() {
        return scholarshipId;
    }

    public String getScholarshipName() {
        return scholarshipName;
    }

    public double getAmount() {
        return amount;
    }
}