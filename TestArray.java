package myFunc;

import java.util.Scanner;

public class TestArray {
	public static void main(String[] args) {
		
		//creating an scanner class
		Scanner scanner=new Scanner(System.in);
		
		int a[]= new int[5];
		System.out.println("Enter array:");
		
		//Taking input of 5 numbers
		for(int i=0; i<5; i++) {
			a[i] = scanner.nextInt();
		}
		
		System.out.println("Numbers you entered:");
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
		
		
	}
}
