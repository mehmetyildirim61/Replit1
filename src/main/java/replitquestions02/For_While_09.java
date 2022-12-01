package replitquestions02;

import java.util.Scanner;

public class For_While_09 {
    //Write a java program to reverse the number which user entered.
    //
    //Input  :1238
    //Output :Reverse Of The Number: 8321
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int number=scan.nextInt();
        String strNumber = ""+number;
        String reverseNumber="";

        for(int i =strNumber.length()-1; i>=0;i--){
            reverseNumber+=strNumber.charAt(i);
        }
        System.out.println(reverseNumber);
    }
}
