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
