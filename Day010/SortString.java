//methood1
public class Mock {
	public static void main(String[] args) {
		String str = "rock";
		char arr[] = str.toCharArray();
		char temp;
		for(int i=0;i<arr.length; i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] =arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(new String(arr));
	}

}

//method 2
public class Mock {
	public static void main(String[] args) {
		String str = "rock";
		char arr[] = str.toCharArray();
		Arrays.sort(arr);
		System.out.println(arr);
	}

}
