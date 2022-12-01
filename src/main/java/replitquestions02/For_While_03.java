package replitquestions02;

import java.util.Arrays;

public class For_While_03 {
    //Write a code that returns the duplicate chars in a String array.(interview Question)
    //
    //Input :
    //
    //String str=“Javaisalsoeasy”
    //
    //Output: [a, s]

    public static void main(String[] args) {
        String str="Javaisalsoeasy";

        String str2="";
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i)) && !str2.contains(str.substring(i,i+1))){
             str2+=str.substring(i,i+1);
            }
        }
        String [] arr=str2.split("");
        System.out.println(Arrays.toString(arr));


    }
}
