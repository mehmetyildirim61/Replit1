package replitquestions02;

public class For_While_06 {
    //Print Alphabet on the console.
    //
    //OUTPUT  : a b c .. .. .. .. y z
    public static void main(String[] args) {

        String alphabet ="";
       for(char i='a'; i<='z'; i++){
           alphabet+=i+" ";
       }
        System.out.println(alphabet);
    }
}
