package app;

import admin.Registrar;
import courses.Course;
import enrollments.Enrollment;
import grading.GradeBook;
import people.Instructor;
import people.Student;

import java.net.http.WebSocket;
import java.util.List;

public class UniversityApp {
    public static void main(String[] args) {
        Enrollment enrollment;

        Student s1 = new Student(1, "Ryan", "Computer Science");
        Student s2 = new Student(2, "Cathy", "Mathematics");
        Student s3 = new Student(3, "Evan", "Physics");

        Instructor i1 = new Instructor(1323, "Prof. Daniel", "Computer Science & Mathematics");
        Instructor i2 = new Instructor(2367, "Dr. James", "Physics");

        Course c1 = new Course(121, "Intro to Java", i1);
        Course c2 = new Course(243, "Discrete Math", i2);

        Registrar registrar = new Registrar();

        Enrollment forRyanJava = registrar.enroll(s1, c1, "Fall 2025");
        Enrollment forRyanDiscreteMath = registrar.enroll(s1, c2, "Fall 2025");
        Enrollment forCathyDiscreteMath = registrar.enroll(s2, c2, "Fall 2025");
        Enrollment forEvanJava = registrar.enroll(s3, c1, "Fall 2025");

        forRyanJava.setGrade("A");
        forRyanDiscreteMath.setGrade("B");
        forCathyDiscreteMath.setGrade("A");
        forEvanJava.setGrade("C");

        List<Enrollment> ryan = registrar.getEnrollmentsFor(s1);
        List<Enrollment> cathy = registrar.getEnrollmentsFor(s2);
        List<Enrollment> evan = registrar.getEnrollmentsFor(s3);

        double ryanGpa = GradeBook.calculateGPA(ryan);
        double cathyGpa = GradeBook.calculateGPA(cathy);
        double evanGpa = GradeBook.calculateGPA(evan);

        System.out.println("Ryan  → GPA: " + ryanGpa);
        System.out.println("Cathy → GPA: " + cathyGpa);
        System.out.println("Evan  → GPA: " + evanGpa + "\n");

        /*registrar.listEnrollmentsFor(c1);
        registrar.listEnrollmentsFor(c2);
        registrar.listEnrollmentsFor(s2);
        registrar.listEnrollmentsFor(s1);*/

        registrar.printTranscript(s1);
        registrar.printTranscript(s2);
        registrar.printTranscript(s3);

    }
}
