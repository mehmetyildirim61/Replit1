package replitquestions05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method_Array_03 {
    //Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.
    //
    //input : ade1r4d3
    //
    //output : 8
    //
    //         Hint :
    //         Use Character.isDigit()
    //         Integer.valueOf()

    public static void main(String[] args) {
        String str = "ade1r4d3";
        
        //1.Yol:
//        String yeniStr= str.replaceAll("[a-z]", "");
//        System.out.println(yeniStr);
//        int sayi =(int) Integer.valueOf(yeniStr);
//        System.out.println(sayi);
//
//        int sayi1 = sayi%10;
//        int sayi2 = (sayi/10)%10;
//        int sayi3 = (sayi/100)%10;
//        System.out.println("toplam: "+(sayi1+sayi2+sayi3));

        //2.Yol:
        sumOfDigits(str);

        }
        public static void sumOfDigits(String a){

            String digit ="";

            for(int i=0; i<a.length(); i++){

            if(Character.isDigit(a.charAt(i))){
               digit=digit+a.charAt(i);
            }
        }
            System.out.println("digit = " + digit);

            String arr[] =digit.split("");

            int brr[] =new int[digit.length()];
            int sum=0;
            for (int i=0; i<digit.length(); i++){
                brr[i]=Integer.parseUnsignedInt(arr[i]);
                sum+=brr[i];
            }
            System.out.println("sum = " + sum);
        }

        }









