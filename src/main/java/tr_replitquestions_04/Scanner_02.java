package tr_replitquestions_04;

import java.util.Scanner;

public class Scanner_02 {
    //Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.
    //
    //Ornek Cikti :
    //
    //Alan: 9
    //
    //Cevre: 12

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Karenin kenar uzunlugunu giriniz");

        double kenarUzunlugu= input.nextDouble();
        double kareninCevresi=4*kenarUzunlugu;
        double kareninAlani = kenarUzunlugu*kenarUzunlugu;

        System.out.println("kareninAlani = " + kareninAlani+" cm2");
        System.out.println("kareninCevresi = " + kareninCevresi+" cm");
    }
}
