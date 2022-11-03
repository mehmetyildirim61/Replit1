package replitquestions05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Method_Array_01 {
    //Write a return method to reverse number.
    //
    //Input  : 12345
    //
    //Output : 54321

    public static void main(String[] args) {

       String input = "12345";
       reverse(input);

    }

    public static void reverse(String a){


        String reverseString = "";

        for(int i=a.length()-1; i>=0; i--){

            reverseString=reverseString+a.charAt(i);

            }
        System.out.println("reverseString = " + reverseString);
        }
    }

