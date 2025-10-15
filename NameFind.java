

package myFunc;
import java.util.Scanner;

public class NameFind {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		 String[] name = new String[1];
	        String[] surname = new String[1];

	        // Take user input
	        System.out.print("Enter name: ");
	        name[0] = sc.next();

	        System.out.print("Enter surname: ");
	        surname[0] = sc.next();
		
		for(int i =0; i<name[0].length(); i++) {
			char ch = name[0].charAt(i);
			if(Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		
		for(int i =0; i<surname[0].length(); i++) {
			char ch = surname[0].charAt(i);
			if(Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println(name[0]);
		System.out.println(surname[0]);
		System.out.println("Sum="+sum);
	}
}
