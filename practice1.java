package myFunc;

import java.util.Scanner;

public class practice1 {
	String name;
	int age;
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		practice1 prac1=new practice1();
		
		System.out.println("Enter the name:");
		String name = scan.next();
		
		System.out.println("Enter the age:");
		int age = scan.nextInt();
		
		System.out.println("name is"+name+"the age is"+age);
		
		
		
	}


}
