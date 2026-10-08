package com.scholarship;

public class Application {

    private String applicationId;
    private String applicationStatus;
    private Scholarship scholarship;

    public Application(String applicationId,
                       String applicationStatus,
                       Scholarship scholarship) {
        this.applicationId = applicationId;
        this.applicationStatus = applicationStatus;
        this.scholarship = scholarship;
    }

    public void displayApplicationDetails() {
        System.out.println("Application ID: " + applicationId);
        System.out.println("Application Status: " + applicationStatus);
        System.out.println("Scholarship: "
                + scholarship.getScholarshipName());
    }
}