package com.Spooky.school;

import com.Spooky.school.model.School;
import com.Spooky.school.model.Teacher;

import java.util.Date;

public class SchoolApplication {
    public static void main(String[] args) {
        School school = new School("Oxford","London23","052122387","London","UK",1);
        Teacher teacer = new Teacher("terry","Ompato","21579316","London24",new Date(),1);//Todo::create more teachers and stundents and groups in new schools
    }
}
