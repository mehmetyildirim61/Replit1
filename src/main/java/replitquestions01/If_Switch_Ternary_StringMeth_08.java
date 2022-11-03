package replitquestions01;

import java.util.Scanner;

public class If_Switch_Ternary_StringMeth_08 {
    //Ask user for a string and print a new string made of 3 copies of the last 2 letters
    //
    //The strings length will be at least 2.
    //
    // Sample:
    //
    //INPUT       : Mustafa
    //OUTPUT      : fafafa
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String kelime = input.next();

        System.out.println(kelime.substring(kelime.length() - 2).repeat(3));
    }
}
