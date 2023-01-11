import java.io.IOException;

public class Mock {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Users\\Abhip\\Desktop\\SQLNOTES\\daly.txt");
			int i;
			while((i = fr.read()) != -1)
			{
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
