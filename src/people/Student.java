package people;

public class Student extends Person {
    private String major;

    public Student(int id, String name, String major) {
        super(id, name);
        this.major = major;
    }

    public String getMajor() { return major; }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println(" and I study " + major);
    }

    @Override
    public String toString() {
        return getId() + ": " + getName() + " (Major - " + getMajor() + ")";
    }
}
