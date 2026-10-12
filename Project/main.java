
package com.scholarship;

public class Main {

    public static void main(String[] args) {

        ScholarshipService service = new ScholarshipService();

        Scholarship s1 = new Scholarship(
                "SCH001",
                "Merit Scholarship",
                50000,
                "Minimum CGPA 8.0"
        );

        Scholarship s2 = new Scholarship(
                "SCH002",
                "Need Based Scholarship",
                30000,
                "Annual income below 300000"
        );

        // CREATE
        System.out.println("===== ADD SCHOLARSHIPS =====");
        service.addScholarship(s1);
        service.addScholarship(s2);

        // READ
        System.out.println("\n===== ALL SCHOLARSHIPS =====");
        service.displayAllScholarships();

        // SEARCH
        System.out.println("\n===== SEARCH SCH001 =====");
        Scholarship found = service.findScholarshipById("SCH001");

        if (found != null) {
            found.displayScholarshipDetails();
        } else {
            System.out.println("Scholarship not found.");
        }

        // UPDATE
        System.out.println("\n===== UPDATE SCH001 =====");
        boolean updated = service.updateScholarship("SCH001", 60000);
        System.out.println("Updated: " + updated);

        // DELETE
        System.out.println("\n===== DELETE SCH002 =====");
        boolean deleted = service.deleteScholarship("SCH002");
        System.out.println("Deleted: " + deleted);

        // FINAL LIST
        System.out.println("\n===== FINAL SCHOLARSHIP LIST =====");
        service.displayAllScholarships();
    }
}
