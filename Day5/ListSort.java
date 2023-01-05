import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		list.add(89);
		list.add(67);
		list.add(66);
		list.add(11);
		list.add(34);
		list.add(14);
		
		System.out.println(list);
		System.out.println("sorting in ascending order");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("sorting in descending order");
		Collections.reverse(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder()); // another method to reverse
		System.out.println(list);
	}
}
