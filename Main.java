package exercise_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int firstNum = 0;
		int secondNum = 0;
		int thirdNum = 0;
		int fourthNum = 0;
		
		try (Scanner input = new Scanner(System.in)){	
			System.out.print("Enter first number : ");
			firstNum = input.nextInt();
		
			System.out.print("Enter second number: ");
			secondNum = input.nextInt();
		
			System.out.print("Enter third number : ");
			thirdNum = input.nextInt();
		
			System.out.print("Enter fourth number: ");
			fourthNum = input.nextInt();
		} catch(InputMismatchException ex) {
			System.out.println("Error: Invalid Input!");
		}
		
		Operators operator = new Operators();
		
		int sum = operator.getSum(firstNum, secondNum);
		int difference = operator.getDifference(secondNum, thirdNum);
		int remainder = operator.getRemainder(sum, difference);
		int product = operator.getProduct(thirdNum, fourthNum);
		int quotient = operator.getQuotient(fourthNum, firstNum);
		
		System.out.format("\nThe sum of %d and %d is %d", firstNum, secondNum, sum);	
		System.out.format("\nThe difference of %d and %d is %d", secondNum, thirdNum, difference);
		System.out.format("\nThe product of %d and %d is %d", thirdNum, fourthNum, product);
		System.out.format("\nThe quotient of %d and %d is %d", fourthNum, firstNum, quotient);
		System.out.format("\nThe remainder of %d and %d is %d\n", sum, difference, remainder);
	
		System.out.format("\nThe product %s is LESS THAN and NOT EQUAL to the quotient of %s is       : %s", product, quotient, (product < quotient)? "True":"False");
		System.out.format("\nThe difference %s is EQUAL to or NOT GREATER THAN the product of %s is : %s", difference, product, (difference <= product)? "True":"False");
		System.out.format("\nThe sum %s is GREATER THAN or NOT EQUAL to the difference %s is          : %s", sum, difference, (sum > difference)? "True":"False");
		System.out.format("\nThe quotient %s is NOT EQUAL to AND NOT LESS THAN the remainder of %s is   : %s\n", quotient, remainder, (quotient > remainder)? "True":"False");
		System.out.format("\nThe remainder %s is NOT LESS THAN the sum %s is                           : %s", remainder, sum, (remainder >= quotient)? "True":"False");
		System.out.format("\nThe third number %s is NOT GREATER THAN the fourth number %s is           : %s", thirdNum, fourthNum, (thirdNum <= fourthNum)? "True":"False");
		System.out.format("\nThe second number %s is LESS THAN EQUAL to the third number %s is         : %s", secondNum, thirdNum, (secondNum <= thirdNum)? "True":"False");
		System.out.format("\nThe first number %s is GREATER THAN EQUAL to the second number %s is       : %s", firstNum, secondNum, (firstNum >= secondNum)? "True":"False");
	}
}
