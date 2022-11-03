package replitquestions01;

import java.util.Scanner;

public class If_Switch_Ternary_StringMeth_07 {
    //Create 2 words : name1 and name2
    //
    //if the name1 has even numbers of characters,
    //
    //then insert the second word in the middle of the first name
    //
    //if the first word has odd numbers
    //
    //Then print the “Name2 cannot be inserted in the name1”
    //
    //e.g:
    //
    //name1= mehmet
    //
    //name2= ahmet
    //
    //Print ==> mehahmetmet
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String name1 = input.next();
        System.out.println("Bir isim daha giriniz");
        String name2 = input.next();

        if(name1.length()%2!=0){
            System.out.println("Name2 cannot be inserted in the name1");
        }else{
            System.out.println(name1.substring(0,name1.length()/2)+name2+name1.substring(name1.length()/2));
        }
    }
}
