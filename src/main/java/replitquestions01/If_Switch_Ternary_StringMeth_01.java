package replitquestions01;

import java.util.Scanner;

public class If_Switch_Ternary_StringMeth_01 {

//Ask user to their weight and height and type a program with calculates mass index
//
//* HINT : Body Mass Index = Weight (kg) / Square of height (m)
//
//Then give a message to user as following:
//
//If BMI is less than 18.5 , you re weak
//If BMI is between 18.5 and 25 , your weight is ideal
//If BMI is between 25 and 30, you re fat
//If BMI is more than or equal to 30, obese
//
//EXAMPLE :
//
//INPUT:
//
//Weight : 71
//
//Height : 1,72
//
//OUTPUT :
//
//Your BMI is  : 23.99945916711736
//Your weight is ideal

public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    System.out.println("Lutfen Kilonuzu kg cinsinden giriniz");
    double kilo = input.nextDouble();
    System.out.println("Lutfen boyunuzu metre cinsinden giriniz");
    double boy = input.nextDouble();

    double bmi= kilo/(boy*boy);
    System.out.println(bmi);

    if(bmi<18.5){
        System.out.println("Your are weak");
    }else if(bmi>=18.5 && bmi<25){
        System.out.println("Your weight is ideal");
    }else if(bmi>=25 && bmi<30){
        System.out.println("You are fat");
    }else if(bmi>=30){
        System.out.println("You are obese");
    }

}

}
