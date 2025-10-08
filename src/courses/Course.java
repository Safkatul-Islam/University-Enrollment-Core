package courses;

import people.Instructor;

public class Course {
    private int code;
    private String title;
    private Instructor instructor;

    public Course(int code, String title, Instructor instructor) {
        this.code = code;
        this.title = title;
        this.instructor = instructor;
    }

    public int getCode() { return code; }
    public String getTitle() { return title; }
    public Instructor getInstructor() { return instructor; }

//    public void describe() {
//        System.out.println("Course " + code + ": " + title + " - Instructor: " + instructor.getName() + " (ID " + instructor.getId() + ")");
//    }

    @Override
    public String toString() {
        return "Course " + code + ": " + title + " - Instructor: " + instructor.getName() + " (ID " + instructor.getId() + ")";
    }
}
