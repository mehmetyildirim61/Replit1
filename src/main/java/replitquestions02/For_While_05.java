package replitquestions02;

public class For_While_05 {
    //Print even numbers from 20 to 0 but do not use decrement (i--).
    //
    //OUTPUT  : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
    public static void main(String[] args) {

        int limit=20;
        String str="";
        while(limit>=0){
            str+=limit+" ";
            limit-=2;
        }
        System.out.println(str);
    }
}
