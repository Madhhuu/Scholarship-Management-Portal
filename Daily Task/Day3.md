Day 3 – Scholarship Application, Eligibility and Status Management

Objective
Implement scholarship creation, student application processing, eligibility verification, application status management, and exception handling for the Scholarship Management Portal.

Tasks
1. Scholarship Management
- Create the Scholarship class.
- Store scholarship details such as name, amount, eligibility criteria, and deadline.
- Create ScholarshipRepository.
- Use Map<String, Scholarship> for scholarship lookup.
- Create ScholarshipFactory for scholarship object creation.
2. Student Management
- Create the Student class.
- Store student details such as student ID, name, email, CGPA, and annual income.
- Create StudentRepository.
- Use Map<String, Student> for student lookup.
- Validate student information before application.
3. Eligibility Management
- Create the EligibilityStrategy interface.
- Implement MeritEligibility.
- Implement IncomeBasedEligibility.
- Check whether a student satisfies the scholarship requirements.
- Return eligibility status based on the student's details.
4. Scholarship Application Management
- Create the Application class.
- Create ApplicationService.
- Allow eligible students to apply for scholarships.
- Generate a unique application ID.
- Link the student with the selected scholarship.
- Prevent duplicate applications for the same scholarship.
5. Application Status
Implement the following statuses:
- SUBMITTED
- UNDER_REVIEW
- APPROVED
- REJECTED
6. Application Tracking
- Create ApplicationRepository.
- Use Map<String, Application> for application lookup.
- Allow students to check their application status.
- Allow the application status to be updated during the review process.
- Identify pending applications using Queue<Application>.
7. Exception Handling
Create:
- InvalidApplicationException – Checked Exception
- ScholarshipNotFoundException – Unchecked Exception
- StudentNotFoundException – Unchecked Exception
- DuplicateApplicationException – Checked Exception
8. Testing
Create JUnit tests for:
- Student creation
- Scholarship creation
- Scholarship lookup
- Student eligibility verification
- Successful scholarship application
- Ineligible student application
- Duplicate application
- Application status update
- Scholarship not found
- Student not found
9. Final Verification
Run:
mvn clean
mvn test
mvn package