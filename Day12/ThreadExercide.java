package genral.practice.daily;

public class MyThread extends Thread {
	
	@Override
	public void run() {              //always no-argument metho will be called when we call strat()
		System.out.println("0-arg method");
	}
	
	public void run(int i) {
		System.out.println("0-arg method");
	}
	
	

}

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
-----------------------------------------
package genral.practice.daily;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("0-arg method");
	}
	
	public void start() {
		System.out.println("custom start method");
	}
	
	

}
 

package genral.practice.daily;

public class TestMyThread {

	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		m1.start();
		System.out.println("Main-thread");
	}

}

//op : custom start method
//	Main-thread
