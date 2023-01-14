package intrrr;
import java.util.Scanner;

public class maxAndMin_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        //adding elements in array
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        //finding mx and min
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];

        }

        System.out.println("Max element in the array is "+max+" "+"Min element in the array "+min);


    }
}
