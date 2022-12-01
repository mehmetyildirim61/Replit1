package replitquestions06;

import java.util.*;
import java.util.stream.Collectors;

public class List_01 {
    //Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)
    //
    //input :
    //
    //Learning java is easy
    //
    //output:
    //
    //maximum occurring character is : a

    public static void main(String[] args) {
        String str = "Learning java is easy";
        str = str.replaceAll(" ", "");

        Map<String, Integer> harfler = new HashMap<>();

        String [] arr =str.split("");

        for (String w: arr) {
            Integer gorunumSayisi=harfler.get(w);

            if(gorunumSayisi==null){
                harfler.put(w, 1);
            }else{
                harfler.put(w, gorunumSayisi+1);
            }
        }
        System.out.println(harfler);
        int max=0;
        char maxOccuringChar;
        for(int w:harfler.values()){
            max= Math.max(max,w);
        }
        for(String w: harfler.keySet()){
            if(harfler.get(w).intValue()==max){
                System.out.println("Maximum occuring character: "+w);
            }
        }
    }
    }



