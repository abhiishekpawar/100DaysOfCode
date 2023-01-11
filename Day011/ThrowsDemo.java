public class Mock {
	
	public static int divide(int a,int b) throws Exception
	{
		int res = a/b;
		return res;	
	}
	
	public static void main(String[] args) 
	{
		try {
			divide(100,0);
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}
}
