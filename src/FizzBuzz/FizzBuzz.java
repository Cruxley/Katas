package FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		//scanner and request for number
		System.out.println("Please enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int userNumber = scanner.nextInt();
		
		//FizzBuzz if divisible by 5 and 3
		
		if(userNumber % 5 == 0 && userNumber % 3 == 0) {
			System.out.println("FizzBuzz");
		}
		
		else if (userNumber % 5 ==0) {
			System.out.println("Fizz");
		}
		
		else if(userNumber % 3 == 0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println(userNumber);
		}

	}

}
