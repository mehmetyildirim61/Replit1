package replitquestions02;

public class For_While_04 {
    //Write a return method that accepts an integer as input and calculates factorial and prints like output.
    //
    //Input : 6
    //
    //Output: 6! = 6*5*4*3*2*1=720
    public static void main(String[] args) {
        calculateFactoriel(7);
    }
    private static void calculateFactoriel(int num){

        int factoriel=1;
        String console ="1";
        for(int i=2; i<=num; i++){
            factoriel*=i;
            console+="*"+i;
        }
        System.out.println(num+"! ="+console+"= "+factoriel);
    }

}
