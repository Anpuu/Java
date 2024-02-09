// Rastgele Sayı Tahmin Programı

package Odevler;
import java.util.Scanner;
import java.util.Random;
public class Odev4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rastgeleSayi = random.nextInt(10) + 1;
        int tahmin;

        do {
            System.out.print("1 ile 10 arasında bir sayı tahmin ediniz: ");
            tahmin = scanner.nextInt();
            if (tahmin == rastgeleSayi) {
                System.out.println("Tebrikler, doğru tahmin!");
            } else {
                System.out.println("Yanlış tahmin, tekrar deneyin.");
            }
        } while (tahmin != rastgeleSayi);

        scanner.close();
    }
}
