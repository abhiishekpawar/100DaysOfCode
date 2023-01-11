//Multiple Inheritence using interface

interface IRemote{
	void on();
	void off();
}

interface IRegulator {
	void rOn();
	void rOff();
}

class Fan implements IRemote,IRegulator{
	@Override
	public void on() {
		System.out.println("Remote button on");
	}
	@Override
	public void off() {
		System.out.println("remote button is off");
	}
	@Override
	public void rOn() {
		System.out.println("Regulator is on");
	}
	@Override
	public void rOff() {
		System.out.println("regulator is off");
	}
	
}

public class MultipleInheritenceDemo {

	public static void main(String[] args) {
		Fan f1 = new Fan();
		f1.off();
		f1.on();
		f1.rOff();
		f1.rOn();
	}
}


