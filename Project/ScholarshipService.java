
package com.scholarship;

import java.util.ArrayList;
import java.util.List;

public class ScholarshipService {

    private final List<Scholarship> scholarships = new ArrayList<>();

    // Add a scholarship
    public void addScholarship(Scholarship scholarship) {
        if (findScholarshipById(scholarship.getScholarshipId()) != null) {
            System.out.println("Scholarship ID already exists.");
            return;
        }

        scholarships.add(scholarship);
        System.out.println("Scholarship added successfully.");
    }

    // Display all scholarships
    public void displayAllScholarships() {
        if (scholarships.isEmpty()) {
            System.out.println("No scholarships available.");
            return;
        }

        for (Scholarship scholarship : scholarships) {
            scholarship.displayScholarshipDetails();
            System.out.println("--------------------");
        }
    }

    // Search by ID
    public Scholarship findScholarshipById(String id) {
        for (Scholarship scholarship : scholarships) {
            if (scholarship.getScholarshipId().equals(id)) {
                return scholarship;
            }
        }

        return null;
    }

    // Update scholarship
    public boolean updateScholarship(String id, double newAmount) {
        Scholarship scholarship = findScholarshipById(id);

        if (scholarship == null || newAmount <= 0) {
            return false;
        }

        scholarship.setAmount(newAmount);
        return true;
    }

    // Delete scholarship
    public boolean deleteScholarship(String id) {
        Scholarship scholarship = findScholarshipById(id);

        if (scholarship == null) {
            return false;
        }

        scholarships.remove(scholarship);
        return true;
    }

    // Return all scholarships
    public List<Scholarship> getAllScholarships() {
        return new ArrayList<>(scholarships);
    }
}
