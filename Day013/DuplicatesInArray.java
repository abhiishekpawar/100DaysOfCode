//bruteforce method
package intrrr;
public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {12,23,34,23,45,34};

        for(int i=0;i<arr.length; i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}


//import java.util.HashSet;
//import java.util.Set;

// using set method
//public class DuplicatesInArray {
//    public static void main(String[] args) {
//        int[] arr = {12,23,34,23,45,34};
//        Set<Integer> set= new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            if(set.contains(arr[i]))
//                System.out.print(arr[i]+ " ");
//            else
//                set.add(arr[i]);
//        }
//    }
//}
