package cleancode;

public class Main {
    public static void main(String[] args) {
        //ürünler
        Product product1 = new Product(1,"Kask",120.0);
        Product product2 = new Product(2,"Paten",75.0);
        //bir normal müşteri, bir öğrenci, bir askeri
        Customer customerIsmail = new Customer(1,"İsmail Bayraktar");
        Student customerEngin = new Student(2,"Engin Demiroğ");


        IBankService iBankService = new CentralBankService();
        ProductManager productManager = new ProductManager(iBankService);
        System.out.println("************");

        System.out.println("Dream Markete Hoşgeldiniz");
        System.out.println("************");
        System.out.println("Lütfen ödeme tipini seçiniz");



        productManager.sell(product1,customerIsmail);
        productManager.sell(product1,customerEngin);





    }

}
