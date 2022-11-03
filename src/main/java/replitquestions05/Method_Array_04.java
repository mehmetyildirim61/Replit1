package replitquestions05;

import java.util.Arrays;
import java.util.Scanner;

public class Method_Array_04 {
    //Create a custom return type method accepts a name as parameter and prints the name as a char array.
    //
    //(do not use toCharArray() method)
    //
    //
    //Input : John
    //
    //Output :[J, o, h, n]
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String name = input.nextLine();
        charArray(name);
    }
    public static void charArray(String a){

        char charArray[] = new char[a.length()];

        for(int i=0; i<a.length(); i++){

            charArray[i]=a.charAt(i);
        }
        System.out.println("charArray = " + Arrays.toString(charArray));
    }
}

