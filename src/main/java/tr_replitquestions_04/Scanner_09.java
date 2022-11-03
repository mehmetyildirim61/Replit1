package tr_replitquestions_04;

import java.util.Scanner;

public class Scanner_09 {
    //Girilen zamanı saniyeye çeviren bir program yazınız.
    //
    //
    //Örnek Çıktı:
    //
    //1 saat 10 dakika 50 saniye ==>
    //
    //4250 saniye
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen zamani saat, dakika ve saniye olarak sirayla giriniz\nsaat: ");
        int saat = input.nextInt();
        System.out.println("dakika: ");
        int dakika = input.nextInt();
        System.out.println("saniye: ");
        int saniye = input.nextInt();

        int toplamSaniye= saat*3600+dakika*60+saniye;
        System.out.println("toplamSaniye = " + toplamSaniye);
    }
}
