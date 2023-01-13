package genral.practice.daily;

public class ThreadPriorityDemo {
	public static void main(String[] args) {
		System.out.println("Current thread priority");
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);//1-100
		System.out.println("After setting the thread priority");
		System.out.println(Thread.currentThread().getPriority());
	}

}
