package org.example;

import org.example.entities.Categories;
import org.example.entities.Course;
import org.example.entities.Instructors;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // Kurslar
        Course course1JavaR = new Course(1,"Java & React", "Full-stack dev.","18.08.2028","18.08.2029",0);
        Course course2FrontEnd = new Course(2,"Front-End dev.","Derinlemesine front-end eğitimi", "08.08.2028","08.08.2038", 0);
        Course course3BackEnd = new Course(3,"Back-End dev.","Veri yapıları, Diagramlar, SQL, ve daha fazlası", "08.08.2024","08.08.2028",0);
        Course course4Fullstack = new Course(4,"Full-Stack dev.","Back-end ve Front-end Konularının hepsi", "08.08.2024","08.08.2028",0);
        Course course5Micro = new Course(5,"Micro Services","Yazılım geliştirme eğitimi,Api ve daha fazlası", "08.08.2024","08.08.2028",0);
        // Kurslar SON

        List<Course> courses = new ArrayList<>();
        courses.add(course1JavaR);
        courses.add(course2FrontEnd);
        courses.add(course3BackEnd);
        courses.add(course4Fullstack);
        courses.add(course5Micro);

        //Kategorilere kurs ekleme
        Categories categories1FullS = new Categories(1,"Full-Stack",courses);
        Categories categories2FullS = new Categories(2,"Full-Stack",courses);
        Categories categories3BackEnd = new Categories(3,"Back-End",courses);
        Categories categories4FrontEnd = new Categories(4,"Front-End",courses);
        Categories categories5YazilimG = new Categories(5,"Yazilim Geliştirme",courses);

        course1JavaR.setCategories(categories1FullS);
        course2FrontEnd.setCategories(categories4FrontEnd);
        course3BackEnd.setCategories(categories3BackEnd);
        course4Fullstack.setCategories(categories2FullS);
        course5Micro.setCategories(categories5YazilimG);
        //Kategorilere kurs ekleme SON


        // Eğitmenler
        Instructors instructorAhmet = new Instructors(1, "Ahmet","Yilmaz",null);
        Instructors instructorsEngin = new Instructors(2,"Engin","Demiroğ",null);
        Instructors instructorsHalit = new Instructors(3,"Halit Enes","Kalaycı",null);
        Instructors instructorsIrem = new Instructors(4,"Irem","Balcı",null);
        Instructors instructorsAkin = new Instructors(5,"Akın","Yazici",null);
        // Eğitmenler Son

        // Atamalar
        course1JavaR.setInstructors(instructorsAkin); // Kurs1 Eğitmen ataması.
        course2FrontEnd.setInstructors(instructorsEngin); // Kurs2 Eğitmen ataması.
        course3BackEnd.setInstructors(instructorsHalit); // Kurs3 Eğitmen ataması.
        course4Fullstack.setInstructors(instructorAhmet); // Kurs4 Eğitmen ataması.
        course5Micro.setInstructors(instructorsIrem); // Kurs5 Eğitmen ataması.
        // Eğitmen atamaları son.

        // Çalıştırma
        course1JavaR.getInfo();
        course2FrontEnd.getInfo();
        course3BackEnd.getInfo();
        course4Fullstack.getInfo();
        course5Micro.getInfo();

    }
}
