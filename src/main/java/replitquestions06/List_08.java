package replitquestions06;

import java.util.Scanner;

public class List_08 {
    //Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.
    //
    //
    //Input :
    //
    //I love Java.
    //
    //Output:
    //
    //Reversed sentence : avaJ evol I.
    //It is not a palindrome"

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a sentence to check if it's a palindrome");
        StringBuilder str = new StringBuilder(scan.nextLine());
        String naturelStr= str.toString();

        String reverseStr =str.reverse().toString();

        System.out.println(reverseStr);
        System.out.println(naturelStr);
        if(naturelStr.equalsIgnoreCase(reverseStr)){
            System.out.println("it's a palindrome");
        }else{
            System.out.println("it's NOT a palindrome");
        }
    }
}
