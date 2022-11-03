package replitquestions01;

import java.util.Scanner;

public class If_Switch_Ternary_StringMeth_02 {

    //Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
    //
    //
    //(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”
    //
    //Input :
    //
    //John White 1234234534561478
    //
    //Output :
    //
    //Name : J*** W****
    //
    //CCN  : **** **** **** 1478
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen isminizi, soyisminizi ve 16 haneli kredi karti numaranizi sirayla giriniz");
        String name= input.next();
        String surName= input.next();
        String numOfCreditCard= input.next();

        if(numOfCreditCard.length()!=16) {
          System.out.println("Girilen numara 16 haneli olmalidir");
      }else if(numOfCreditCard.replaceAll("[0-9]","").length()>0) {
          System.out.println("Lutfen kredi karti numarasi icin sadece numerik data kullaniniz");
      }else{

        name=name.toUpperCase().charAt(0)+name.substring(1).replaceAll("[a-zA-Z]", "*");
        surName=surName.toUpperCase().charAt(0)+surName.substring(1).replaceAll("[a-zA-Z]", "*");
        numOfCreditCard=numOfCreditCard.substring(0,4).replaceAll("[0-9]", "*")+" "+numOfCreditCard.substring(4,8).replaceAll("[0-9]", "*")+
                " "+numOfCreditCard.substring(8,12).replaceAll("[0-9]", "*")+" "+numOfCreditCard.substring(12);

            System.out.println(name + " " + surName + "\n" + numOfCreditCard);
        }

    }
}
