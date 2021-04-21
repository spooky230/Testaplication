package school.model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Human {
    private Group group;
    private List<Subject> subjects;

    public Teacher(String firstName, String lastName, String phoneNumber, String address, Date dateOfBirth, long id) {
        super(firstName, lastName, phoneNumber, address, dateOfBirth, id);
        this.subjects = new LinkedList<>();
    }

    public Teacher(){
        this.subjects = new LinkedList<>();
    }

    public Group getGroup() {
        return group;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
