package tr_replitquestions_04;

import java.util.Scanner;

public class Scanner_04 {
    //Dairenin alanini ve cevresini hesaplayan java kodunu yaziniz.
    //
    //r=7;
    //
    //Pi=3.14
    //
    //Ipucu:
    //
    //Dairenin Cevresi : 2*Pi*r
    //
    //Dairenin Alani : Pi*r*r
    //
    //Ornek Cikti:
    //
    //43.96
    //
    //153.86

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yaricap uzunlugunu giriniz");
        double yariCap= input.nextDouble();

        double daireninAlani=3.14*yariCap*yariCap;
        double daireninCevresi=2*3.14*yariCap;

        System.out.println("daireninCevresi = " + daireninCevresi+" cm");
        System.out.println("daireninAlani = " + daireninAlani+" cm2");

    }
}
