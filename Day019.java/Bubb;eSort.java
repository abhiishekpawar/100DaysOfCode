package hello.src.load;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {7,8,3,1,2};
		
		for(int i=0;i<arr.length-1; i++)
		{
			for(int j =i+1; j<arr.length; j++)
			{
				if(arr[i]> arr[j]) {
					//swap
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}

//time-complexity -- 0(n^2)
