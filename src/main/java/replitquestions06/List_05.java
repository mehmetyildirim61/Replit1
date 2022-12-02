package replitquestions06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_05 {
    //Write a program that accepts an integer as input and prints first 10 prime numbers greater than input
    //Check numbers if they are even or not in a return method.
    //
    //Input : 5
    //
    //Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]

    public static void main(String[] args) {
        Scanner input  =new Scanner(System.in);
        System.out.println("Pozitif bir tam sayi girin.\nSonraki 10 adet asal sayi goruntulenecek:" );
        int sayi=input.nextInt();
        List<Integer> asalSayilar=new ArrayList<>();

        int i=sayi+1;
        do{
           if(primeNumOrNot(i)){
               asalSayilar.add(i);
           }
           i++;
        } while(asalSayilar.size()<10);
        System.out.println("asalSayilar = " + asalSayilar);
    }

    static boolean primeNumOrNot(int i){

        boolean prime = true;
        for(int k=2; k<i; k++){
            if(i%k==0){
                prime= false;
            }
        }
        return prime;
    }
}
