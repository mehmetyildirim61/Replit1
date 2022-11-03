package replitquestions01;

import java.util.Scanner;

public class If_Switch_Ternary_StringMeth_03 {
    //Write a Java program to compute and print sum of two given numbers (more than or equal to zero).
    //
    //If given integers or the sum have more than 10 digits, print "overflow".
    //
    //EXAMPLE:
    //
    //INPUT      :
    //Input two integers:
    //
    //25
    //
    //46
    //
    //OUTPUT :
    //
    //Sum of the numbers: 71

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz");
        double ilkSayi = input.nextDouble();
        System.out.println("Lutfen 2. sayiyi giriniz");
        double ikinciSayi = input.nextDouble();

        double max = Math.pow(10, 9);
        if(ilkSayi<0 ||ikinciSayi<0){
            System.out.println("lutfen pozitif sayilar giriniz");
        }else if(ilkSayi>=max || ikinciSayi>=max || ilkSayi+ikinciSayi>=max){
            System.out.println("overflow");
        }else{
            System.out.println("Toplam: "+ (ilkSayi+ikinciSayi));
        }

    }
}
