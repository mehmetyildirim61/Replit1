package replitquestions02;

import java.util.Scanner;

public class For_While_02 {
    //Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
    //
    //Input :
    //
    //30 and 40
    //
    //Expected OutPut:
    //
    //GCD for 30 and 40 = 10
    //
    //LCM for 30 and 40 = 120
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter two integer values");
        int num1= input.nextInt();
        int num2= input.nextInt();

        int GCD =1;
       int limit= Math.min(num1, num2);
        for(int i=1; i<=limit; i++){
            if(num1%i==0 && num2%i==0){
                int commonDivisor = i;
                GCD=Math.max(GCD,commonDivisor);

            }
        }
        System.out.println("GCD: "+GCD);
        int LCM = 1;
        for(int i=1; i<=limit; i++){
            if(num1%i==0 && num2%i==0){
                num1/=i;
                num2/=i;
                LCM*=i;
            }
        }
        LCM=LCM*num1*num2;
        System.out.println("LCM: "+LCM);
    }
}
