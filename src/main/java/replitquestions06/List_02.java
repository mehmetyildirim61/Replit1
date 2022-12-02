package replitquestions06;

import java.util.Arrays;
import java.util.List;

public class List_02 {
    //Create a 10-element list. Swap the 8th element with the 3rd element.
    //
    //
    //INPUT :
    //String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
    //
    //Output:
    //
    //[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali");
        System.out.println("names = " + names);

        String temp=names.get(2);

        names.set(2, names.get(7));
        names.set(7,temp);
        System.out.println("names = " + names);
    }
}


