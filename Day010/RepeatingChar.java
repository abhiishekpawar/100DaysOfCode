public class Mock {
	public static void main(String[] args) {
		String input = "OPENTEXT";
		char replaceWith = 'T';
		int cnt =1;
		char arr[] = input.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == replaceWith)
			{
				arr[i] = String.valueOf(cnt).charAt(0);
				cnt++;
			}
		}
		System.out.println(new String(arr));
		
	}

}
