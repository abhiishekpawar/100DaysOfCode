public class Mock {
	public static void main(String[] args) {
		
		//nested try-catch
		
		try {
			int i=10/1;
			System.out.println(i);  //10
			try {
				int arr[] = {10,30,03,45};
				int res = arr[10];
				System.out.println(res);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);  //e
			}		
			
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
