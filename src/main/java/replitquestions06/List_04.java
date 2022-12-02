package replitquestions06;

import java.util.Arrays;
import java.util.List;

public class List_04 {
    //Write a program that deletes the letters 'a' from the names in the list given as input.
    //
    //
    //         INPUT :
    //         list1={"Ali","Veli","Ayse","Fatma","Omer"}
    //
    //         OUTPUT :
    //
    //         [Veli,Omer]  =====>hatali cikti, taske gore a'lar gitmeli sadece, asagida cozum ona gore
    public static void main(String[] args) {

        List<String> names= Arrays.asList("Ali","Veli","Ayse","Fatma","Omer");
        for (String w : names){
            String newName = w.replaceAll("a","").replaceAll("A","");
            names.set(names.indexOf(w),newName);
        }
        System.out.println(names);
    }
}
