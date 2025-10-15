package myFunc;

//abstract class
abstract class vehicle {
	
	abstract void start(); //abstract method , No body
	
	void stop() {
		System.out.println("car stops.");
	}
}

class car extends vehicle {
	//Implementing the abstract method
	//@overriding
	void start() {
		System.out.println("The car starts with button or key.");
	}
}

public class prac5 {
	public static void main(String[] args) {
		car obj=new car();
		obj.start();
		obj.stop();
	}
}
