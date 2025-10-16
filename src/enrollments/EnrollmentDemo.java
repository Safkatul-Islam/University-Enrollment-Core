package enrollments;

import courses.Course;
import people.Instructor;
import people.Student;

public class EnrollmentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ryan", "Computer Science");
        Student s2 = new Student(2, "Cathy", "Mathematics");
        Instructor i = new Instructor(129, "Dr. Lee", "CS & Math");
        Course c = new Course(121, "Intro to Java", i);
        Enrollment e1 = new Enrollment(s1, c, "Fall 2025");
        Enrollment e2 = new Enrollment(s2, c, "Fall 2024");

        System.out.println(e1);
        System.out.println(e2);

        e1.setGrade("A");
        System.out.println(e1);
    }
}
