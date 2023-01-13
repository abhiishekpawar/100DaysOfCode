package genral.practice.daily;

public class ThreadSleepDemo {
	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<=10; i++)
		{
			System.out.println("slide--"+i);
			Thread.sleep(2000);
		}
	}

}


package genral.practice.daily;

public class JoinDemo extends Thread {
	@Override
	public void run() {
		for(int i=1; i<10; i++)
		{
			System.out.println("radha thrad");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
-------------------------------------------
package genral.practice.daily;

public class InteruptDemo extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<10;i++)
		{
			System.out.println("i am Lazy  Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("i got interupted");
			}
		}
	}
	

}


package genral.practice.daily;

public class InteruptDemoRunner {

	public static void main(String[] args) {
		InteruptDemo t = new InteruptDemo();
		t.start();
		t.interrupt();
		System.out.println("main thread");

	}

}
