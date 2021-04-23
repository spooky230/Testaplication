package com.Spooky.school.model;

import java.util.LinkedList;
import java.util.List;

public class Group {
    private long id;
    private String name;
    private int classNumber;
    private Teacher curator;
    private List<Student> students;

    public Group(){
        this.students = new LinkedList<>();
    }
    public Group(String name,Teacher curator,long id,int classNumber){
        this();
        this.name = name;
        this.curator = curator;
        this.id = id;
        this.classNumber = classNumber;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Teacher getCurator() {
        return curator;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurator(Teacher curator) {
        this.curator = curator;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
