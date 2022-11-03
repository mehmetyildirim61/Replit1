package tr_replitquestions_04;

import java.util.Scanner;

public class Scanner_07 {
    //Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ondalik kismi olan bir sayi giriniz");

        double doubleSayi = input.nextDouble();
        int intSayi = (int)doubleSayi;
        System.out.println("intSayi = " + intSayi);
    }
}
