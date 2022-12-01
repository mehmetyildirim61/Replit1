package replitquestions02;

import java.util.Scanner;

public class For_While_01 {
    //Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name
    //
    //e.g:
    //
    //char ch1= 'a' ;
    //
    //String name =“John came late"
    //
    //Expected Output: Number of a = 2
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scan.nextLine();
        System.out.println("Please enter a char to search in the String");
        char ch =scan.next().charAt(0);

        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("Number of '"+ch+"' in the String is: "+count);
    }
}
