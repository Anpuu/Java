// Ürün Sayısı ve Fiyatı İle Toplam Tutarı Hesaplama
package Odevler;
import java.util.Scanner;

public class Odev2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç ürün almak istiyorsunuz? ");
        int urunSayisi = scanner.nextInt();
        double toplamTutar = 0;

        for (int i = 1; i <= urunSayisi; i++) {
            System.out.print(i + ". ürünün fiyatını giriniz: ");
            double fiyat = scanner.nextDouble();
            toplamTutar += fiyat;
        }

        System.out.println("Toplam alışveriş tutarınız: " + toplamTutar);
        scanner.close();
    }

}
