package intrrr;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res =1;
        for(int i=1;i<=n;i++)
        {
            res = res *i;
        }

        System.out.println("Factorial of the number is "+ res);
    }
}
