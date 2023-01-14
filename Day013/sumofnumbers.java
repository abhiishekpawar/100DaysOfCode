package intrrr;
import java.util.Scanner;

public class sumofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int sum=0;

        //adding elements in array
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }

        //adding elemnenst
        for(int i=0;i< a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println("the sum of number is "+ sum);
    }
}
