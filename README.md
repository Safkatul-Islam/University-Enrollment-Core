# University Management System

A Java-based university management system that handles student enrollments, course management, and grade tracking.

## Project Structure

```
src/
├── admin/
│   ├── Registrar.java
│   └── RegistrarDemo.java
├── app/
│   └── UniversityApp.java
├── courses/
│   ├── Course.java
│   └── CourseDemo.java
├── enrollments/
│   ├── Enrollment.java
│   └── EnrollmentDemo.java
├── grading/
│   ├── GradeBook.java
│   └── GradeBookDemo.java
└── people/
    ├── Instructor.java
    ├── Person.java
    ├── PeopleDemo.java
    └── Student.java
```

## Features

- **Student Management**: Track students with ID, name, and major
- **Instructor Management**: Manage instructors with ID, name, and department
- **Course Management**: Create courses with course codes, titles, and assigned instructors
- **Enrollment System**: Register students for courses with semester tracking
- **Grade Management**: Assign and track grades for student enrollments
- **GPA Calculation**: Automatic GPA calculation based on enrolled courses
- **Transcript Generation**: Generate student transcripts showing all enrollments and grades

## Components

### Core Classes

- **Person**: Base class for people in the system
- **Student**: Represents a student with personal and academic information
- **Instructor**: Represents an instructor teaching courses
- **Course**: Represents a course with associated instructor
- **Enrollment**: Links students to courses with semester and grade information
- **Registrar**: Manages enrollments and provides administrative functions
- **GradeBook**: Handles GPA calculations and grade-related operations

### Demo Classes

Each module includes a demo class for testing functionality independently.

## Usage

Run `UniversityApp.java` to see the system in action:

```java
// Create students and instructors
Student s1 = new Student(1, "Ryan", "Computer Science");
Instructor i1 = new Instructor(1323, "Prof. Daniel", "Computer Science & Mathematics");

// Create courses
Course c1 = new Course(121, "Intro to Java", i1);

// Enroll students
Registrar registrar = new Registrar();
Enrollment enrollment = registrar.enroll(s1, c1, "Fall 2025");

// Assign grades
enrollment.setGrade("A");

// Calculate GPA
double gpa = GradeBook.calculateGPA(registrar.getEnrollmentsFor(s1));

// Print transcript
registrar.printTranscript(s1);
```

## Requirements

- Java 8 or higher

## Running the Application

```bash
# Compile
javac -d out src/app/UniversityApp.java

# Run
java -cp out app.UniversityApp
```

## Sample Output

```
Ryan  → GPA: 3.5
Cathy → GPA: 4.0
Evan  → GPA: 2.0

[Student transcripts with course details and grades...]
```

## Author

Created for university course management

