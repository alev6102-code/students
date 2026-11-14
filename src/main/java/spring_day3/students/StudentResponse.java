package spring_day3.students;

public class StudentResponse {

    private final int id;
    private final String name;
    private final Group group;
    public StudentResponse(int id, String name, Group group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Group getGroup() {
        return group;
    }
}
