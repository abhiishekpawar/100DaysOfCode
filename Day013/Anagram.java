package intrrr;
import java.util.Arrays;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        
        Arrays.sort(c1);
        Arrays.sort(c2);

        if(c1.length != c2.length) {
            System.out.println("Not a anagrams");
            System.exit(0);
        }
        else{
            for(int i=0;i<c1.length;i++)
            {
                if(c1[i] !=c2[i]){
                    System.out.println("Not a anagram");
                    System.exit(0);
                }
            }
        }
            System.out.println("anagrams");

    }
}
