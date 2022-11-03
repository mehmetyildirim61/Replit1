package replitquestions05;

import java.util.Arrays;

public class Method_Array_08 {
    //Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.
    //
    //Input1={1,2,3,4}
    //
    //Input2={5,6}
    //
    //Output={1,2,3,4,5,6}
    public static void main(String[] args) {

        int arr[] = {1,2,3,4};
        int brr[] = {5, 6};
        combineArrays(arr, brr);
    }
    public static  void combineArrays(int[] a, int[] b){

        int c[] =new int[a.length+b.length];
        for(int i=0; i<a.length; i++){
            c[i]=a[i];
        }
        for(int i=0; i<b.length; i++){
            c[a.length+i]=b[i];
        }
        System.out.println("Combined Array= " + Arrays.toString(c));
    }
}
