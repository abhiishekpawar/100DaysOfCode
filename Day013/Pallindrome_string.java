package intrrr;
import java.util.Scanner;

public class Pallindrome_string {
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

        //compare with the original string
        if(temp.equals(rev)){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not a pallindrome");
        }

    }
}
