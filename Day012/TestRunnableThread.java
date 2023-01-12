package genral.practice.daily;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<6; i++)
		{
			System.out.println("child thread");
		}
		
	}
	
}

 
