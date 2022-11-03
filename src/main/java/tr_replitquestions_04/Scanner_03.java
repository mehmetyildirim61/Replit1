package tr_replitquestions_04;

import java.util.Scanner;

public class Scanner_03 {
    //Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.
    //
    //Örnek Çıktı:
    //
    //Alan: 32
    //
    //Çevre: 24
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdortgenin 1. kenar uzunlugunu giriniz");
        double kenarUzunlugu1= input.nextDouble();

        System.out.println("Dikdortgenin 2. kenar uzunlugunu giriniz");
        double kenarUzunlugu2= input.nextDouble();

        double dikdortgeninCevresi=2*kenarUzunlugu1+2*kenarUzunlugu2;
        double dikdortgeninAlani = kenarUzunlugu1*kenarUzunlugu2;

        System.out.println("dikdortgeninAlani = " + dikdortgeninAlani+" cm2");
        System.out.println("dikdortgeninCevresi = " + dikdortgeninCevresi+" cm");
    }
}
