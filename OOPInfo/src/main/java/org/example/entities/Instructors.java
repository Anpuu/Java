package org.example.entities;

public class Instructors {

    private  int ID;

    private  String name;

    private  String surname;

    private  Course course;

    public Instructors(int ID, String name, String surname, Course course) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.course = course;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
