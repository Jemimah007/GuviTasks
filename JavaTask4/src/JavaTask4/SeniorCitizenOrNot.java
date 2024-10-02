package JavaTask4;

import java.util.Scanner;

public class SeniorCitizenOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		
		if(age>18) {
			System.out.println("This person is Senior Citizen");
		} 
		
		else
			System.out.println("This person is not a Senior Citizen");

	}

}
