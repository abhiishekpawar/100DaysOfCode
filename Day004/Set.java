import java.util.*;


public class sol {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Rohit");
		set.add("Rahul");
		set.add("Virat");
		set.add(null);   //set can store only one null value
		set.add("Sky");
		System.out.println(set);
		
		
		Set<String> set1 = new LinkedHashSet<>();   //LinkedHashSet maintains insertion order
		set1.add("Rohit");
		set1.add("Rahul");
		set1.add("Viat");
		set1.add(null);   //set can store only one null value
		set1.add("Sky");
		System.out.println(set1);
		
		
		Set<String> set2 = new TreeSet<>();
		set2.add("Rohit");
		set2.add("Rahul");
		set2.add("Viat");
		//set2.add(null);   //Treeset can not store null value and gives error
		set2.add("Sky");
		System.out.println(set2);
		
		
	}

}
