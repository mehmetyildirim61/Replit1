package replitquestions01;

import java.util.Scanner;

public class If_Switch_Ternary_StringMeth_06 {

    //Ask user to type a name,
    //
    //the length of name should be 3.
    //
    //Then check if the name has same characters.
    //
    //If the String has same characters
    //
    //Print “String has duplicate characters”
    //Else
    //
    //Print “String has unique characters”
    //
    //Please use ternary.
    //
    //
    //Input :
    //
    //ala
    //
    //OutPut:
    //
    //String has duplicate characters
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("3 harfli bir isim giriniz");
        String name = input.next();

        String result = name.length()==3 ? (((name.charAt(0)==name.charAt(1)) || (name.charAt(0)==name.charAt(2)) ||(name.charAt(1)==name.charAt(2))) ?
                "String has duplicate characters" : "String has not duplicate characters") : "String length should be 3";
        System.out.println("result = " + result);

    }


}
