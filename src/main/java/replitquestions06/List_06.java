package replitquestions06;

import java.util.ArrayList;
import java.util.List;

public class List_06 {
    //Write a program to find the common elements between two String Arrays (without case sensitivity)
    //
    //Input1 : {John,Brad,Ange,Sofia,Emily}
    //
    //Input2 : {sofia,brad,grace,emily,hazel}
    //
    //
    //Output : [sofia,brad,emily]
    public static void main(String[] args) {
        String [] arr1 ={"John","Brad","Angela","Sofia","Emily"};
        String [] arr2 ={"sofia","brad","grace","emily","hazel"};
        List<String> commonElements = new ArrayList<>();

        for(String w: arr1){
            for(String str:arr2){
                if(w.equalsIgnoreCase(str)){
                    commonElements.add(w);
                }
            }
        }
        System.out.println("commonElements = " + commonElements);

    }
}
