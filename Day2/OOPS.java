//classes and objects

import java.util.*;

public class Mock {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.carName = "swift";
		c1.price = 1000;
		
		Car c2 = new Car();
		c2.carName = "Audi";
		c2.price = 34000;
		
		System.out.println("car name is "+c1.carName+ " and car price is "+c1.price);
		System.out.println("car name is "+c2.carName+ " and car price is "+c2.price);
	}
	
}

class Car{
	String carName;
	int price;
}
//---------------------------------------------------------------------------------------------------
//Method : 
import java.util.*;

public class Mock {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.carName = "swift";
		c1.price = 1000;
		
		Car c2 = new Car();
		c2.carName = "Audi";
		c2.price = 34000;
		
		System.out.println("car name is "+c1.carName+ " and car price is "+c1.price);
		System.out.println("car name is "+c2.carName+ " and car price is "+c2.price);
		
		c1.runCar();
		c2.park();
		c2.park("tata");
		
	}
	
}

class Car{
	String carName;
	int price;
	
	void runCar() {
		System.out.println(carName +" is running");
	}
	
	void park() {
		System.out.println(carName+ " is parked in the parking");
			
	}
	
	//function with arguments
	void park(String y) {
		System.out.println(y+" is parked in the parking");
	}
}

//---------------------------------------------------------------------------------------------------
//polymorphism:

1)compile-time polymorphism
2)run-time ploymorphism


1)compile-time polymorphism

import java.util.*;

public class Mock {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.carName = "swift";
		c1.price = 1000;
		
		Car c2 = new Car();
		c2.carName = "Audi";
		c2.price = 34000;
		
		System.out.println("car name is "+c1.carName+ " and car price is "+c1.price);
		System.out.println("car name is "+c2.carName+ " and car price is "+c2.price);
		
		c1.runCar();
		c2.park();
		c2.park("tata");  //Compile-time polymorphism
		
	}
	
}

class Car{
	String carName;
	int price;
	
	void runCar() {
		System.out.println(carName +" is running");
	}
	
	void park() {
		System.out.println(carName+ " is parked in the parking");
			
	}
	
	//function with arguments
	void park(String y) {
		System.out.println(y+" is parked in the parking");
	}
}
2)run-time ploymorphism
















---------------------------------------------------------------------------------------------------
//Constructors : 
 // Use to create objects;
 // used to count the number of objects created
 // static keyword is valid only in class not in the main method
 // to initalize the methods and variables

---------------------------------------------------------------------------------------------------
//this() keyword :

import java.util.*;

class Maths{
	int a=10;
	
	void display() {
		int a = 20;
		System.out.println(this.a);
		System.out.println(a);
	}
	
	
	
}

public class Mock {
	public static void main(String[] args) {
		Maths m = new Maths();
		m.display();
	}

}
//---------------------------------------------------------------------------------------------------
//inheritence :
class Animal{
	void eat() {
		System.out.println("eating");
	}
	
	void sleep() {
		System.out.println("sleeping");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("dog is barking");
	}
}

public class Mock {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
		d.sleep();
	}

}
---------------------------------------------------------------------------------------------------
Abstract keyword: 

	*if class name has abstract keyword then the objects of that class can not be creatrd
	* if we dealare absract keyword to metho need to intialize the method

abstract class Animal {
	abstract void run();

}

class Dog extends Animal{     //here dog class is called as concrete class

	@Override
	void run() {
		System.out.println("running");
		
	}
	
}

public class Mock {

	public static void main(String[] args) {
		//Animal a  = new Animal(); gievs error
		Dog d = new Dog();;
		d.run();
		

	}
}














