package replitquestions02;

public class For_While_07 {
    //Write java code checking the number is Perfect number or not.
    //
    //* Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.
    //
    //Input :6
    //Output:6 is Perfect Number
    //Input :7
    //Output:7 is not Perfect Number
    public static void main(String[] args) {
        int number = 8;
        int sum=0;
        for(int i=1; i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum==number){
            System.out.println(number+" is Perfect Number");
        }else{
            System.out.println(number+" is not Perfect number");
        }
    }
}
