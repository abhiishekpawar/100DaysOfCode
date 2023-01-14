package intrrr;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicatesin2arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1  = {80,10,15,2,35,60};
        int[] arr2 = {35,80,60,20,75};

        Set<Integer> set = new HashSet<>();

        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++)
        {
            if(set.contains(arr2[i]))
            {
                System.out.println(arr2[i]);
            }else {
                set.add(arr1[i]);
            }
        }
    }
}
