package spring_day3.students;

public class CreateStudent {

    private final String name;
    private final Group group;
    public CreateStudent( String name, Group group) {
        this.name = name;
        this.group = group;
    }
    public String getName() {
        return name;
    }
    public Group getGroup() {
        return group;
    }
}
