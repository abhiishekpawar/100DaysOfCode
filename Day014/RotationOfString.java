package hello.src.load;

/*
 input = "abcd";
 output = "bcda";
 */

public class RotationOfString {
	
	public static void main(String[] args) {
		
		String s = "abcd";
		String res = "";
		char[] ch = s.toCharArray();
		char x = ch[0];
		for(int i=ch.length-1;i>0; i--)
		{
			res += ch[i];
		}
		
		System.out.println(res);
		
	}

}
