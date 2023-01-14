package intrrr;
import java.util.Scanner;

public class Revese_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int r=0,sum=0;
        while(n>0)
        {
            r = n%10;
            sum = sum*10+r;
            n = n/10;
        }
        System.out.println("reversed number is "+ sum);
    }
}
