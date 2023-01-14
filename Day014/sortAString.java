package hello.src.load;

public class sortAString {
	
	public static void main(String[] args) {
		String s = "bafsi";
		char[] ch = s.toCharArray();
		char temp;
		for(int i=0;i<ch.length; i++)
		{
			for(int j=i+1;j<ch.length; j++)
			{
				if(ch[i]>ch[j]) {
					temp = ch[i];
					ch[i]=  ch[j];
					ch[j] = temp;
				}
			}
		}
		
//		for(Character c: ch) {
//			System.out.println(c);
//		}
		System.out.println(new String(ch));
	}

}
