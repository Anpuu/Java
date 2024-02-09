public class Customer {
    private int Id;

    private String FristName;

    private String LastName;


    private String City;

    //SOLID S= BIR CLAS 1 İŞİ YAPAR
    public  void Save(){
        System.out.println("Müşteri Kaydedildi.");
    }

    public Customer(){

        System.out.println("Müşteri nesnesi başlatıldı.");
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getFristName() {
        return FristName;
    }

    public void setFristName(String fristName) {
        FristName = fristName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
