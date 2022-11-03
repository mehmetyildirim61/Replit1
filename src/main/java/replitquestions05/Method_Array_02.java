package replitquestions05;

import java.util.Arrays;

public class Method_Array_02 {
    //Write a Java program that reverse a sentence by using Array (with all spaces and special characters).
    //
    //Input  : Coding is greate.
    //
    //Output : .etaerg si gnidoC

    public static void main(String[] args) {

        String input = "Coding is greate.";

        String arr[]= input.split("");
        String brr[] = new String[arr.length];
        System.out.println(Arrays.toString(arr));
        
        
        for(int i=arr.length-1; i>=0; i--){
            
            brr[arr.length-1-i]=arr[i];
        }

        System.out.println("Arrays.toString(brr) = " + Arrays.toString(brr));

        String reverseString = "";

        for(String w: brr){
            reverseString=reverseString.concat(w);
        }
        System.out.println("reverseString = " + reverseString);

        //2.Yol: StringBuilder

        StringBuilder input2 = new StringBuilder(input);

        input2.reverse();
        System.out.println("input2 = " + input2);  //

        String input3=input2.toString();  //Tekrar boylece String'e dondurebiliriz

    }
}
