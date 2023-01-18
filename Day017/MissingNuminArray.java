package hello.src.load;

public class MissingNuminArray {

	public static void main(String[] args) {
		int[] arr = {5,3,1,2};
		int n = arr.length;
		int sum = (n+1)*(n+2)/2;
		for(int i=0; i<n;i++)
		{
			sum = sum - arr[i];
		}
		
		System.out.println(sum);
	}

}
