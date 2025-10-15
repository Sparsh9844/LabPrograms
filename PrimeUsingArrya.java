package myFunc;

import java.util.Scanner;

public class PrimeUsingArrya {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting range:");
        int srange = scanner.nextInt();

        System.out.println("Enter the ending range:");
        int erange = scanner.nextInt();

        int[] primes = new int[erange - srange + 1]; // enough space
        int index = 0; // position in array

        for (int i = srange; i <= erange; i++) {
            if (i > 1) { // 1 is not prime
                int count = 0;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    primes[index] = i; // store prime
                    index++;
                }
            }
        }

        // Print stored primes
        System.out.println("Prime numbers:");
        for (int k = 0; k < index; k++) {
            System.out.print(primes[k] + " ");
        }
    }
}
