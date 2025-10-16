package enrollments;

import courses.Course;
import people.Student;

public class Enrollment {
    private Student student;
    private Course course;
    private String term;
    private String grade;

    public Enrollment(Student student, Course course, String term) {
        this.student = student;
        this.course = course;
        this.term = term;
        this.grade = "N/A";
    }

    public Student getStudent() { return student; }
    public Course getCourse() { return course; }
    public String getTerm() { return term; }
    public String getGrade() { return grade; }

    public void setGrade(String gpa) { this.grade = gpa; }


    @Override
    public String toString() {
        return student.getName() + " (ID " + student.getId() + ") -> " + course.getCode() + " - " + course.getTitle() + " | Term: " + term + " | Grade: " + grade;
    }

//    public void printRecord() {
//        System.out.println(student.getName() + " (ID " + student.getId() + ") -> " + course.getCode() + " " + course.getTitle() + " | Term: " + term + " | Grade: " + gpa);
//    }
}
