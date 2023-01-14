package intrrr;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("before swapping n1: "+n1);
        System.out.println("before swapping n2: "+n2);

        //swapping
       n1 = n1+n2;
       n2 = n1-n2;
       n1 = n1-n2;
        System.out.println("after swapping n1: "+n1);
        System.out.println("after swapping n1: "+n2);

    }
}
