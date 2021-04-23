package com.Spooky.school.model;

public class Subject {
    private String name;
    private String description;
    private long id;
    public Subject(String name,String description,long id){
        this.name = name;
        this.description = description;
        this.id = id;
    }
    public Subject(){

    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(long id) {
        this.id = id;
    }
}
