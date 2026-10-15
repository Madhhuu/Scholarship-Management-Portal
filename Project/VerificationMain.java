
package com.scholarship;

public class VerificationMain {

    public static void main(String[] args) {

        Application application =
                new Application("APP001", "STU001", "SCH001");

        VerificationService verificationService =
                new VerificationService();

        System.out.println("--- APPLICATION VERIFICATION ---");

        System.out.println("Initial Status: " + application.getStatus());

        verificationService.verifyApplication(
                application, "VERIFIED", "");

        System.out.println("Updated Status: " + application.getStatus());

        verificationService.displayVerificationDetails("APP001");

        System.out.println("\n--- SECOND APPLICATION ---");

        Application application2 =
                new Application("APP002", "STU002", "SCH002");

        verificationService.verifyApplication(
                application2, "CORRECTION_REQUIRED",
                "Income certificate is missing");

        System.out.println("Updated Status: " + application2.getStatus());

        verificationService.displayVerificationDetails("APP002");
    }
}
