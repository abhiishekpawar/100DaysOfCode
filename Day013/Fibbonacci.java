package intrrr;
import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0;
        int b = 1;
        int c = 0;
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+ " ");
            c =a+b;
            a=b;
            b=c;
        }

    }
}
