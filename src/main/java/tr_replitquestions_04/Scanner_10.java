package tr_replitquestions_04;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Scanner_10 {
    //Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
    //
    //INPUT:
    //
    //Dakika sayısı: 3456789
    //
    //OUTPUT :
    //
    //3456789 dakika yaklaşık 6 yıl 210 gündür
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dakika olarak bir zaman giriniz: ");
        int dakika = input.nextInt();

        int yil=dakika/(60*24*365);
        int gun=(dakika%(60*24*365))/(60*24);

        System.out.println(dakika+" dakika yaklasik "+yil+" yil "+gun+" gundur. ");
    }
}
