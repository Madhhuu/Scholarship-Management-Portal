# Day 3 – Scholarship CRUD Implementation

## 1. Objective
To implement basic Create, Read, Update, and Delete operations for scholarship schemes using Java.

## 2. Theory Studied
CRUD operations are commonly used to manage records in software applications.

- **Create:** Add a scholarship record.
- **Read:** Display or search for scholarship information.
- **Update:** Modify existing scholarship details.
- **Delete:** Remove a scholarship record.

The Java ArrayList collection was used to store scholarship objects temporarily in memory.

## 3. Tasks Performed
- Implemented the Scholarship class with fields for scholarship ID, scholarship name, amount, and eligibility criteria.
- Created a constructor to initialize scholarship details.
- Added getter methods to access scholarship information.
- Implemented validation to prevent non-positive scholarship amounts.
- Created the ScholarshipService class.
- Used ArrayList to maintain a collection of scholarship objects.
- Implemented adding and displaying scholarships.
- Implemented searching for a scholarship using its ID.
- Implemented updating a scholarship amount.
- Implemented deleting a scholarship record.
- Added a check to prevent duplicate scholarship IDs.

## 4. Main Program Implementation
Updated the Main class to create sample scholarship records and call the service methods.

Two sample records were used:
- SCH001 – Merit Scholarship
- SCH002 – Need Based Scholarship

## 5. Testing Performed
- Added both scholarship records.
- Displayed all available scholarships.
- Searched for SCH001.
- Updated the amount of SCH001 from ₹50,000 to ₹60,000.
- Deleted SCH002.
- Displayed the final scholarship list.

## 6. Learning Outcomes
Learned how to organize Java code into separate classes, manage objects using ArrayList, validate input values, and implement CRUD operations through service methods.

## 7. Outcome
Successfully compiled and executed the Java console prototype. The output confirmed that scholarship creation, display, search, update, and deletion were working.

Note: The current prototype stores data in memory. Database integration has not yet been implemented.