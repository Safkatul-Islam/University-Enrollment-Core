package courses;

import people.Instructor;

public class CourseDemo {
    public static void main(String[] args) {
        Instructor i = new Instructor(200, "Dr. Lee", "Mathematics");
        Course c = new Course(101, "Calculus I", i);

        System.out.println(c);
        System.out.println(c.getInstructor().getDepartment());
    }
}
