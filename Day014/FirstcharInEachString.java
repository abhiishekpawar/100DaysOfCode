package hello.src.load;

public class FirstcharInEachString {
	public static void main(String[] args) {
		String s = "the quick brown fox jumps over the lazy dog";
		String[] arr = s.split(" ");
		for(int i=0;i<arr.length; i++)
		{
			String x = arr[i];
			System.out.print(x.charAt(0)+" ");
		}
	}

}
