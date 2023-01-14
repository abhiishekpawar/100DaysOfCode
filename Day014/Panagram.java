package hello.src.load;

public class Panagram {
	
	public static void main(String[] args) {
		String s = "the quick brown fox jumps over the lazy dog";
		for(char ch='a';ch<='z';ch++)
		{
			if(s.indexOf(ch)<0) {
				System.out.println(false);
				System.exit(0);
			}
		}
		System.out.println(true);
	}

}
  