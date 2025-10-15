package myFunc;

import java.util.Scanner;

public class primeNumber {
	
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number:");
		String input = sc.nextLine();
		
		int num = Integer.parseInt(input);
		
		for(int i=num; i>1; i--) {
			System.out.println(i+ "->" +isPrime(i));
		}
		
	}
}
