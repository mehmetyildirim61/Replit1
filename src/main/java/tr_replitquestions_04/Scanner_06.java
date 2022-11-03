package tr_replitquestions_04;

import java.util.Scanner;

public class Scanner_06 {
    //Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ondalik kismi olan bir sayi giriniz");

        float floatSayi = input.nextFloat();
        short shortSayi = (short)floatSayi;
        System.out.println("shortSayi = " + shortSayi);
    }
}
