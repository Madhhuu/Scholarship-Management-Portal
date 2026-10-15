
package com.scholarship;

public class Application {

    private String applicationId;
    private String studentId;
    private String scholarshipId;
    private String applicationStatus;
    private Scholarship scholarship;

    public Application(String applicationId, String studentId,
                       String scholarshipId) {
        this.applicationId = applicationId;
        this.studentId = studentId;
        this.scholarshipId = scholarshipId;
        this.applicationStatus = "SUBMITTED";
        this.scholarship = null;
    }

    public Application(String applicationId, String applicationStatus,
                       Scholarship scholarship) {
        this.applicationId = applicationId;
        this.applicationStatus = applicationStatus;
        this.scholarship = scholarship;
        this.studentId = "";
        this.scholarshipId =
                scholarship != null ? scholarship.getScholarshipId() : "";
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getScholarshipId() {
        return scholarshipId;
    }

    public String getStatus() {
        return applicationStatus;
    }

    public void setStatus(String status) {
        this.applicationStatus = status;
    }

    public void displayApplicationDetails() {
        System.out.println("Application ID: " + applicationId);
        System.out.println("Application Status: " + applicationStatus);

        if (scholarship != null) {
            System.out.println("Scholarship: "
                    + scholarship.getScholarshipName());
        } else {
            System.out.println("Scholarship ID: " + scholarshipId);
        }
    }
}
