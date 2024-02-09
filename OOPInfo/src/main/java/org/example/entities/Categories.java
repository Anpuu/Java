package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Categories {

    private  int ID;

    private  String name ;

    private List<Course> courses;


    public Categories(int ID, String name,List<Course> course){
        this.ID = ID;
        this.name = name;
        this.courses = course;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


    @Override
    public String toString() {
        return name;
    }
}
