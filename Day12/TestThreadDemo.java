package genral.practice.daily;

public class TestMyThread {

	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		m1.start();
		for(int i=0; i<10;i++)
		{
			System.out.println("Main-thread");
		}

	}

}
