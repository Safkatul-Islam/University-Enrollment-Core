package admin;

import courses.Course;
import enrollments.Enrollment;
import grading.GradeBook;
import people.Student;

import java.util.ArrayList;
import java.util.List;

public class Registrar {
    private List<Enrollment> enrollments = new ArrayList<>();

    public Enrollment enroll(Student s, Course c, String term) {
        Enrollment e = new Enrollment(s, c, term);
        enrollments.add(e);
        return e;
    }

    public int getTotalEnrollments() {
        return enrollments.size();
    }

    public void printAllEnrollments() {
        for (Enrollment e : enrollments) {
            System.out.println(e);
        }
    }

    public void listEnrollmentsFor(Student s) {
        for (Enrollment e : enrollments) {
            if (e.getStudent() == s) {
                System.out.println(e);
            }
        }
    }

    public void listEnrollmentsFor(Course c) {
        System.out.println("Roster for " + c.getTitle());
        for (Enrollment e : enrollments) {
            if (e.getCourse() == c) {
                System.out.println(" - " + e.getStudent().getName());
            }
        }
    }

    public List<Enrollment> getEnrollmentsFor(Student s) {
        List<Enrollment> result = new ArrayList<>();
        for (Enrollment e : enrollments) {
            if (e.getStudent() == s) {
                result.add(e);
            }
        }
        return result;
    }

    public void printTranscript(Student s) {
        List<Enrollment> enrollments = getEnrollmentsFor(s);
        System.out.println(s.getName() + "(ID " + s.getId() + ") — Transcript");
        for (Enrollment e : enrollments) {
            System.out.println(e.getCourse().getCode() + " - " + e.getCourse().getTitle() +  " - " + e.getTerm() + " - Grade: " + e.getGrade());
        }
        System.out.println("GPA: " + GradeBook.calculateGPA(enrollments) + "\n");
    }

}
