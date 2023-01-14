package hello.src.load;

public class Rev_each_word_in_string {
	
	public static void main(String[] args) {
		String input = "java code";
		String op = "";
		String[] words = input.split(" ");
		for(String word: words) {
			
			String revWord = "";
			for(int i=word.length()-1; i>=0;i--) {
				revWord += word.charAt(i);
			}
			op = op + revWord+" ";
		}
		System.out.println(op);
	}

}
