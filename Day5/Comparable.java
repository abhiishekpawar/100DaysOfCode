import java.util.*;
public class ComparableDemo {

	public static void main(String[] args) {
		Integer i1 = new Integer(20);
		Integer i2 = new Integer(10);
		System.out.println(i1.compareTo(i2));//if invoking class(i1) > passed clas(i2) then op will be 1
		
		Integer i3 = new Integer(10);
		Integer i4 = new Integer(20);
		System.out.println(i3.compareTo(i4));//if invoking class(i3) < passed clas(i4) then op will be -1
		
		Integer i5 = new Integer(20);
		Integer i6 = new Integer(20);
		System.out.println(i5.compareTo(i6));// if both are same value then 00
	}

}

