package intrrr;
import java.util.Scanner;

public class SearchEleInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] a = {12,34,3,1,5,7,6};
        boolean found = false;

        for(int i:a){
            if(i == x){
                found = true;
            }
        }
        if(found)
            System.out.println("found ");
        else
            System.out.println("NOt found");
    }
}
