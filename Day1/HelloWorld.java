package intrrr;
import java.util.Scanner;

public class Count_vowel_cons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vowels =0;
        int consonant = 0;
        char[] ch = s.toCharArray();

        for(int i=0;i<ch.length;i++)
        {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
            {
                vowels+=1;
            }
            else {
                consonant += 1;
            }
        }

        System.out.println("Number of vowels are "+vowels+" Number of consonant are "+consonant);
    }
}
