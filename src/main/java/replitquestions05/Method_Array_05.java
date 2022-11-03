package replitquestions05;

public class Method_Array_05 {
    //Write a java program that calculates the average value of array elements
    //
    //input[]= {1,2,3,4,5,6,7}
    //
    //Output : 4

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};

        System.out.println("avarage value: "+((arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]+arr[6])/7));

        //2. yol:
        int sum=0;
        for(int w : arr){
            sum+=w;
        }
        int average=sum/ arr.length;
        System.out.println("average = " + average);
    }
}

