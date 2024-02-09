package cleancode;

import  java.util.Scanner;

public class ProductManager implements IProductService{
    private IBankService iBankService;
    public ProductManager(IBankService iBankService){
        this.iBankService = iBankService;
    }
    @Override
    public void sell(Product product, Customer customer) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - TL olarak ödeme yapmak için");
        System.out.println("2 - USD olarak ödeme yapmak için.");
        int paymentType = scanner.nextInt();
        double price = product.getPrice();

        // If yapısından farklı bir yapı araştır ve yapmaya çalış
        if(paymentType == 1){

            System.out.println("Ödeme onaylanıyor..");
            System.out.println("Ödeme onaylanıyor..");
            System.out.println("Ödeme onaylanıyor..");
            System.out.println("Ödeme onaylanıyor..");
            System.out.println("*******************");
            System.out.println("Satın alma işlemi başarı ile tamamlandı.");
            System.out.println("Ürünlerinizin toplam fiyatı: " + product.getPrice()); // ürün isimlerini de getirmeye çalış başka bir yöntem bul.
        }
        else if(paymentType == 2){
            price = product.getPrice();
            CurrencyRate currencyRate = new CurrencyRate(price,1);
            price = iBankService.convertRate(currencyRate);
            System.out.println("*******************");
            System.out.println("Ödeme onaylanıyor..");
            System.out.println("Ödeme onaylanıyor..");
            System.out.println("Ödeme onaylanıyor..");
            System.out.println("Ödeme onaylanıyor..");
            System.out.println("*******************");
            System.out.println("Satın alma işlemi başarı ile tamamlandı.");
            System.out.println("*******************");
            System.out.println("Ürünlerinizin toplam fiyatı: " + price + " USD");
        }
    }
    public void sell(Product product, Student student){
        double price = product.getPrice() * student.getDiscountRate();
        System.out.println("*******************");
        System.out.println("Tebrikler!!, Öğrenci olduğunuz için %50 indirim kazandınız");
        System.out.println("*******************");
        System.out.println("Ödeme onaylanıyor..");
        System.out.println("Ödeme onaylanıyor..");
        System.out.println("Ödeme onaylanıyor..");
        System.out.println("Ödeme onaylanıyor..");
        System.out.println("*******************");
        System.out.println("Normal satın alma fiyatı: " + product.getPrice());
        System.out.println("Öğrenci indirimili ürün fiyatı: " + price);
    }

}
