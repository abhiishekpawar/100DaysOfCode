package intrrr;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class merge2array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1  = {80,10,15,2,35,60};
        int[] arr2 = {35,80,60,20,75};

        List<Integer> list = new ArrayList<>();
        for(int i=0;i< arr1.length;i++)
        {
            list.add(arr1[i]);
        }
        for(int i=0;i< arr2.length;i++)
        {
            list.add(arr2[i]);
        }

        System.out.println(list);


    }
}
