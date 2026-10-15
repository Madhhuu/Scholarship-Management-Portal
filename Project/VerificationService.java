
package com.scholarship;

import java.util.HashMap;
import java.util.Map;

public class VerificationService {

    private final Map<String, String> verificationReasons = new HashMap<>();

    public boolean verifyApplication(
            Application application, String decision, String reason) {

        if (application == null) {
            System.out.println("Application not found.");
            return false;
        }

        if (!"SUBMITTED".equals(application.getStatus())) {
            System.out.println("Only submitted applications can be verified.");
            return false;
        }

        if ("VERIFIED".equals(decision)) {
            application.setStatus("VERIFIED");
            verificationReasons.put(application.getApplicationId(),
                                    "Documents verified");

            System.out.println("Application verified successfully.");

        } else if ("CORRECTION_REQUIRED".equals(decision)) {
            if (reason == null || reason.trim().isEmpty()) {
                System.out.println("Please provide a correction reason.");
                return false;
            }

            application.setStatus("CORRECTION_REQUIRED");
            verificationReasons.put(application.getApplicationId(),
                                    reason.trim());

            System.out.println("Application returned for correction.");

        } else {
            System.out.println("Invalid verification decision.");
            return false;
        }

        return true;
    }

    public void displayVerificationDetails(String applicationId) {
        String reason = verificationReasons.get(applicationId);

        if (reason == null) {
            System.out.println("No verification details found.");
        } else {
            System.out.println("Application ID: " + applicationId);
            System.out.println("Verification details: " + reason);
        }
    }
}
