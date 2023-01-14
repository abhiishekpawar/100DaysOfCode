package intrrr;
import java.util.Scanner;

public class Revese_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String temp= s;
        String rev = "";
        char[] ch=s.toCharArray();
        //loop reverse
        for(int i=ch.length -1;i>=0;i--)
        {
            rev +=ch[i];
        }
        System.out.println("reversed string "+rev);
    }
}
