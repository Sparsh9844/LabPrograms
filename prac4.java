package myFunc;

class Animal {
	public void animalSound() {
		System.out.println("The animal makes the sound:");
	}
}
class Dog extends Animal {
	public void animalSound() {
		System.out.println("The dog makes sound:wow wow");
	}
}

public class prac4 {
	public static void main(String[] args) {
		Animal myAnimal=new Animal();
		Dog myDog = new Dog();
		
		myAnimal.animalSound();
		myDog.animalSound();
	}
}
