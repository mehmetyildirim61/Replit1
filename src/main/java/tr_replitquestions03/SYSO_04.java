package tr_replitquestions03;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SYSO_04 {
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
        double radius = 3;

        double alan = 3.14*radius*radius;
        double cavre = 2*3.14*radius;

        NumberFormat obj = new DecimalFormat(".00");

        System.out.println("cavre = " +obj.format(cavre) + " cm");
        System.out.println("alan = " + obj.format(alan)+ " cm2");
    }
}
