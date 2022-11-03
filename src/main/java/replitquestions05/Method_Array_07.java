package replitquestions05;

public class Method_Array_07 {
    //Write a method that accepts an array as parameter and returns sum off all elements in the array Then print the result in the main method.
    //
    //
    //Eg :
    //
    //input : {1,2,3,4,5,6,7,8};
    //
    //output: 36
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8};
        sumOfElements(arr);
    }
    public static void sumOfElements(int[] a){

        int sum=0;
        for(int w: a){
            sum+=w;
        }
        System.out.println("sum = " + sum);
    }

}

