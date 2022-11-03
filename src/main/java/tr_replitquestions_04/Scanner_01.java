package tr_replitquestions_04;

import java.util.Scanner;

public class Scanner_01 {
    //Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        double sayi = input.nextDouble();
        double sayiKupununYarisi=Math.pow(sayi, 3)/2;

        System.out.println("sayiKupununYarisi = " + sayiKupununYarisi);
    }
}
