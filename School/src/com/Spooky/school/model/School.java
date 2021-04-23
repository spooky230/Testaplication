package com.Spooky.school.model;

import java.util.LinkedList;
import java.util.List;

public class School {
    private String name;
    private String adress;
    private String phone;
    private String city;
    private String country;
    private long id;
    private List<Group> groupsList;
    private List<Teacher> teachersList;
    private Teacher director;
    public School (String name, String adress, String phone, String city, String country, long id){
        this();
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.id = id;
    }
    public School (){
        groupsList = new LinkedList<>();
        teachersList = new LinkedList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public List<Group> getGroupsList() {
        return groupsList;
    }

    public List<Teacher> getTeachersList() {
        return teachersList;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone() {
        return phone;
    }

    public Teacher getDirector() {
        return director;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDirector(Teacher director) {
        this.director = director;
    }

    public void setGroupsList(List<Group> groupsList) {
        this.groupsList = groupsList;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setTeachersList(List<Teacher> teachersList) {
        this.teachersList = teachersList;
    }
}
