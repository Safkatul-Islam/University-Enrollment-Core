package People;

public class PeopleDemo {
    public static void main(String[] args) {
        Student s = new Student(1, "Ryan", "Computer Science");
        Instructor i = new Instructor(100, "Dr. Kim", "CS");

        s.introduce();
        i.introduce();

        System.out.println(s.getMajor());
        System.out.println(i.getDepartment());
    }
}
