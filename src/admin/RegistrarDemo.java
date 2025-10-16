package admin;

import courses.Course;
import people.Instructor;
import people.Student;

public class RegistrarDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ryan", "Computer Science");
        Student s2 = new Student(2, "Cathy", "Mathematics");
        Student s3 = new Student(3, "Evan", "Data Science");
        Instructor i = new Instructor(129, "Dr. Lee", "CS & Math");
        Course c = new Course(121, "Intro to Java", i);
        Course c1 = new Course(121, "Intro to Java", i);

        Registrar registrar = new Registrar();

        System.out.println(registrar.enroll(s1, c, "Fall 2025"));
        System.out.println(registrar.enroll(s2, c, "Fall 2025"));
        System.out.println(registrar.enroll(s3, c, "Fall 2025"));

        registrar.enroll(s1, c, "Fall 2025");
        registrar.enroll(s2, c, "Fall 2025");
        registrar.enroll(s3, c, "Fall 2025");
        registrar.enroll(s1, c1, "Fall 2025");

        registrar.listEnrollmentsFor(s1);
        registrar.listEnrollmentsFor(c);
        registrar.listEnrollmentsFor(c1);
    }
}
