package JavaTask4;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number to calculate its factorial: ");
		int number = scanner.nextInt();

		long factorial = calculateFactorial(number);

		System.out.println(number + "! = " + factorial);

	}

	public static long calculateFactorial(int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
