//String Metotları

package Odevler;

public class Odev6 {
    public static void main(String[] args) {
        String metin = "Merhaba Dünya";

// length()
        System.out.println("Uzunluk: " + metin.length());

// charAt()
        System.out.println("3. karakter: " + metin.charAt(2));

// substring()
        System.out.println("7'den itibaren: " + metin.substring(7));

// contains()
        System.out.println("Dünya içeriyor mu: " + metin.contains("Dünya"));

// equals()
        System.out.println("Merhaba Dünya'ya eşit mi: " + metin.equals("Merhaba Dünya"));

// indexOf()
        System.out.println("Dünya'nın başlangıç indeksi: " + metin.indexOf("Dünya"));

    }
}
