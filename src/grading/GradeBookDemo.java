package grading;

import courses.Course;
import enrollments.Enrollment;
import people.Instructor;
import people.Student;

import java.util.ArrayList;
import java.util.List;

public class GradeBookDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ryan", "CS");
        Student s2 = new Student(2, "Emma", "Math");
        Student s3 = new Student(3, "Jake", "DSA");
        Course c1 = new Course(121, "Programming in Java", new Instructor(1234, "Prof. Daniel", "CS & Math"));
        Enrollment e1 = new Enrollment(s1, c1, "Fall 2025");
        Enrollment e2 = new Enrollment(s2, c1, "Fall 2025");
        Enrollment e3 = new Enrollment(s3, c1, "Fall 2025");
        List<Enrollment> enrollments = new ArrayList<>();
        enrollments.add(e1);
        enrollments.add(e2);
        enrollments.add(e3);

        System.out.println(e1 + "\n" + e2 + "\n" + e3);
        System.out.println(GradeBook.calculateGPA(enrollments));

        e1.setGrade("A");
        e2.setGrade("B");
        e3.setGrade("C");

        System.out.println(e1 + "\n" + e2 + "\n" + e3);
        System.out.println(GradeBook.calculateGPA(enrollments));

        e2.setGrade("N/A");
        System.out.println(e1 + "\n" + e2 + "\n" + e3);
        System.out.println(GradeBook.calculateGPA(enrollments));

    }
}
