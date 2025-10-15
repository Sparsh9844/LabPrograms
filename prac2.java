package myFunc;

import java.util.Scanner;

public class prac2 {
	//creating attributes
	int length;
	int bredth;
	int result;
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//creating object prac2
		prac2 angle=new prac2();
		
		System.out.println("Enter the length:");
		int length = scan.nextInt();
		
		System.out.println("Enter the bredth:");
		int bredth = scan.nextInt();
		
		int result = length*bredth;
		
		System.out.println("area of rectangle is:"+result);
		
	}
	
}
