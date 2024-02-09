//Öğrenci Bilgileri ve Not Ortalaması

package Odevler;
import java.util.Scanner;

public class Odev7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Öğrenci sayısını giriniz: ");
        int ogrenciSayisi = scanner.nextInt();

        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.print(i + ". öğrencinin adını giriniz: ");
            String ad = scanner.next();
            System.out.print(i + ". öğrencinin soyadını giriniz: ");
            String soyad = scanner.next();
            System.out.print("1. sınav notunu giriniz: ");
            int sinav1 = scanner.nextInt();
            System.out.print("2. sınav notunu giriniz: ");
            int sinav2 = scanner.nextInt();
            System.out.print("3. sınav notunu giriniz: ");
            int sinav3 = scanner.nextInt();

            double ortalama = (sinav1 + sinav2 + sinav3) / 3.0;
            System.out.println(ad + " " + soyad + " öğrencisinin not ortalaması: " + ortalama);
        }
        scanner.close();
    }
}

