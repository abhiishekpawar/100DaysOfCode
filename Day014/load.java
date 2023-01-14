package hello.src.load;

public class load {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class Loaded and Registered");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
