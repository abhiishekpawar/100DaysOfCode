//Example-1
import java.util.*;

public class Anagram {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("Abhishek");
		lst.add("yash");
		lst.add("salman");
		lst.add("kohli");

		System.out.println("Iteration usin for loop");
		for (int i = 0; i < lst.size(); i++) {
			System.out.print(lst.get(i) + " ");
		}

		System.out.println();
		System.out.println("Iteration using for each loop");
		for (String s : lst) {
			System.out.print(s + " ");
		}

		System.out.println();
		System.out.println("Iteration using List Iterator");
		Iterator<String> itr = lst.iterator();
		// Iterator method 1 & 2;
		while (itr.hasNext()) {
			String ele = itr.next();
			System.out.print(ele + " ");
		}

		// Iterator method 3
		System.out.println();
		
		Iterator<String> itr1 = lst.iterator();
		while (itr1.hasNext()) {
			String ele = itr1.next();
			if (ele.equals("kohli")) {
				itr1.remove();
			}
		}
		System.out.println(lst);

	}
}
//-----------------------------------------------------------------------------
//Example-2
import java.util.*;

public class Customer {
	private String cname;
	private long contact;
	private String email;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return this.cname+" "+this.contact+" "+this.email;
	}
	
	
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCname("Abhishek");
		c1.setContact(123455787403l);
		c1.setCname("abhi@gmail.com");
		
		Customer c2 = new Customer();
		c2.setCname("pawar");
		c2.setContact(123455787403l);
		c2.setCname("pawar@gmail.com");
		
		
		Customer c3 = new Customer();
		c3.setCname("shek");
		c3.setContact(123455787403l);
		c3.setCname("shek@gmail.com");
		
		List<Customer> lst = new ArrayList<>();
		lst.add(c1);
		lst.add(c2);
		lst.add(c3);
		
		Iterator<Customer> itr = lst.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
