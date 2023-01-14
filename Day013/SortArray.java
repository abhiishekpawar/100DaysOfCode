package intrrr;
//   BUBBLE SORT

public class SortArray {
    public static void main(String[] args) {
        int[] a = {12,435,37,3,129,4,};
        int temp;

        //sorting
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        //printing the array
        for(int y:a){
            System.out.print(y+ " ");
        }
    }
}
