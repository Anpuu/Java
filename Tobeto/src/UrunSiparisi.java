import java.util.Scanner;

public class UrunSiparisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sipariş numaranızı giriniz: ");
        int siparisNo = scanner.nextInt();

        switch (siparisNo) {
            case 1:
                System.out.println("Siparişiniz: Kitap");
                break;
            case 2:
                System.out.println("Siparişiniz: Kalem");
                break;
            case 3:
                System.out.println("Siparişiniz: Defter");
                break;
            default:
                System.out.println("Geçersiz sipariş numarası.");
        }
        scanner.close();
    }
}
