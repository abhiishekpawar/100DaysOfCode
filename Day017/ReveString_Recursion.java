package hello.src.load;

public class ReveString_Recursion {
	public static String revString(String str)
	{
		if(str == null || str.length() <=1)
			return str;
		
		//recursive call
		return revString(str.substring(1))+str.charAt(0);
		
	}
	
	public static void main(String[] args) {
		
		String str = "abhishek";
		System.out.println(revString(str));
		
	}

}
 