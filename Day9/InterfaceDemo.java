
interface ISwitch {
	void sOn();

	void sOff();

}

class Tv implements ISwitch {

	@Override
	public void sOn() {
		System.out.println("Tv is on");
	}

	@Override
	public void sOff() {
		System.out.println("Tv is Off");
	}
}

public class InterfaceDemo  {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		t1.sOn();
		t1.sOff();
	}
}
