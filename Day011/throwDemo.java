public class Mock {
	
	public static void validate(int age)
	{
		if(age <18)
			throw new  ArithmeticException("not elgibel");
		else
			throw new ArithmeticException("elgible");
	}
	
	public static void main(String[] args) {
		validate(14);
		System.out.println("rest of the code...........");
	}
}


