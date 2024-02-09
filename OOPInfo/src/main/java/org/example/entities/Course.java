package org.example.entities;

public class Course {

    private  int ID;
    private  String name;
    private  String desc;
    private Categories categories;
    private Instructors instructors;
    private String startDate;
    private String endDate;
    private int price;



// Derse katıl kısmını nasıl yapabilirim ?


    public Course(int ID, String name, String desc, String startDate, String endDate, int price ) {
        this.ID = ID;
        this.name = name;
        this.desc = desc;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public void getInfo(){
        System.out.println("------------" +
        "\nKurs adı: " + name +
        "\nKurs Açıklaması: " + desc +
        "\nKategori: " + categories +
        "\nEğitmen: " + instructors.getName() + " " + instructors.getSurname() +
        "\nBaşlangıç Tarihi: " + startDate +
        "\nBitiş Tarihi: " + endDate +
        "\nKurs Ücreti: " + price );
    }
}
