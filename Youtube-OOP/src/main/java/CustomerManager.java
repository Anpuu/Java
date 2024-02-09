
// Katmanlı mimari ?
public class CustomerManager {

    private ICreditManager creditManager;
    private  Customer customer;

    //******** HAYATİ BİR NOT INTERFACELER REFERANS TIPTIR. INTERFACE REFERANS TIP OLDUGU ICIN HER KIM
    //******** BU BIZIM ICreditManager'a referans veriyorsa birkaç yerde kullanılabilir.
    public CustomerManager(Customer customer, ICreditManager _creditManager) {

        this.creditManager = _creditManager;

        customer = customer;

    }
    public  void Save(){

        System.out.println("Müşteri Kaydedildi.");
    }
    public  void Delete(){

        System.out.println("Müşteri Silindi.");
    }


    public void GiveCredit(){
        creditManager.add();
        System.out.println("Kredi Verildi...");
    }

}
