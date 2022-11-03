package replitquestions01;

import java.util.Scanner;

public class If_Switch_Ternary_StringMeth_05 {

    //Write a Java program to find the number of days in a month.(Use Switch Case) (Interview Question / Leak Year)
    //
    //        Sample:
    //
    //          INPUT:
    //
    //        Input a month number: 2
    //
    //        Input a year: 2016
    //
    //          OUTPUT  :
    //
    //        February 2016 has 29 days
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("yili giriniz");
        int yil = input.nextInt();
        System.out.println("Ay numarasini giriniz");
        int ay = input.nextInt();

        switch (ay){
            case (1):
                System.out.println("January "+yil+" has 31 days");
                break;
            case (3):
                System.out.println("March "+yil+" has 31 days");
                break;
            case (5):
                System.out.println("May "+yil+" has 31 days");
                break;
            case (7):
                System.out.println("July "+yil+" has 31 days");
                break;
            case (8):
                System.out.println("August "+yil+" has 31 days");
                break;
            case (10):
                System.out.println("October "+yil+" has 31 days");
                break;
            case (12):
                System.out.println("December "+yil+" has 31 days");
                break;
            case (4):
                System.out.println("April "+yil+" has 30 days");
                break;
            case (6):
                System.out.println("June "+yil+" has 30 days");
                break;
            case (9):
                System.out.println("September "+yil+" has 30 days");
                break;
            case (11):
                System.out.println("November "+yil+" has 30 days");
                break;
            case (2):
                if((yil%4==0 && yil%100!=0) || yil%400==0) {
                    System.out.println("February " + yil + " has 29 days");
                }else{
                    System.out.println("February " + yil + " has 28 days");
                }
                break;
            default:
                System.out.println("Invalid mounth number");
        }
    }
}
