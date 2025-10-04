package People;

public class Instructor extends Person{
    private String department;

    public Instructor(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public String getDepartment() { return department; }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println(" and I teach in " + department);
    }
}
