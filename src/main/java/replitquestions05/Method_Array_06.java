package replitquestions05;

import java.util.Arrays;

public class Method_Array_06 {
    //Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array
    //
    //Input : {3,2,5,4,1,6}
    //
    //Output :
    //
    //min: 1
    //
    //max: 6
    public static void main(String[] args) {

        int arr[] ={3,2,5,4,1,6};
        minMaxValues(arr);
    }
    public static void minMaxValues(int[] a){

        Arrays.sort(a);

        System.out.println("Minimum deger: "+a[0]);
        System.out.println("Maximum deger: "+a[a.length-1]);
    }

}
