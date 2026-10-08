Day 2: Basic Java Class Design & Object Modeling

1. Today's Objective
Implement the fundamental Java classes required for a Scholarship Management Portal to model the relationship:
Student → Scholarship → Application
The objective is to understand how Java classes and objects can be used to represent real-world entities in the scholarship system.
2. Concepts Learned

Class: A blueprint that defines the attributes and behaviors of an object.
Object: A concrete instance of a class created using the new keyword.
Fields (Attributes): Variables inside a class that store the object's data or state.
Constructor: A special method with the same name as the class that initializes an object when it is created.
Methods: Functions inside a class that define the actions or behaviors an object can perform.
Composition (Has-a Relationship): Connecting classes together. For example, a Student has an Application, and an Application has a Scholarship.
Separation of Concerns: Keeping Student, Scholarship, and Application as separate classes, with each class having a specific responsibility.

3. Classes Created
Student.java
Fields:
- studentName
- studentId
- email
Method:
- displayStudentDetails()
Scholarship.java
Fields:
- scholarshipName
- amount
- eligibilityCriteria
Method:
- displayScholarshipDetails()
Application.java
Fields:
- applicationId
- applicationStatus
- scholarship
Method:
- displayApplicationDetails()
Main.java
Entry point containing the main() method to create objects and execute the program.

4. What Was Implemented
- Modeled the core entities of the Scholarship Management Portal.
- Created separate Java classes for Student, Scholarship, and Application.
- Created parameterized constructors for easy object initialization.
- Used objects to represent real-world scholarship information.
- Linked the objects together:
Student ("Gayathiri")
↓
Application ("APP001", "Pending")
↓
Scholarship ("Merit Scholarship", ₹50,000)
This represents how a student can apply for a particular scholarship and track the application status.

5. Testing & Output
The Java classes were compiled and executed using:
javac *.java
java Main

Sample Output
Student Details:
Student Name: Gayathiri
Student ID: STU001
Email: gayathiri@gmail.com

Scholarship Details:
Scholarship Name: Merit Scholarship
Amount: ₹50000
Eligibility: Minimum CGPA 8.0

Application Details:
Application ID: APP001
Status: Pending
Scholarship: Merit Scholarship