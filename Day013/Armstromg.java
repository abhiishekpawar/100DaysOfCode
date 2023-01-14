//         1)create the function to calculate the no.of digits in the number
//         2create the function to calculate the power
package intrrr;
import java.util.Scanner;

public class Armstromg {

    //pow method

    static int pow(int b,int p)
    {
        int res = 1;
        for(int i=1;i<=p;i++)
        {
          res = res *b;
        }
        return  res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;

        //calculate number of digits
        int count =0;
        while(num > 0)
        {
            count += 1;
            num = num/10;
        }

        //Logic of anagram
        int n = temp;
        int anm = 0;
        while (n > 0)
        {
            int r = n%10;
            anm = anm + pow(r,count);
            n = n/10;
        }

        //comparing with the original values
        if(temp == anm)
            System.out.println("anagram");
        else
            System.out.println("not a anagram");



    }
}
