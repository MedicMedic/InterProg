package calculator;
import java.util.Scanner;

public class act1 
{
	public static void main (String[] args)
	{
		char operator;
		double numIn1, numIn2, result = 0;
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("Input number 1: ");
		numIn1 = input.nextDouble();
		System.out.print("Input number 2: ");
		numIn2 = input.nextDouble();
		input.nextLine();
		System.out.print("Input operation: ");
		operator = input.next().charAt(0);
		switch (operator)
		{
			case '+' : result = numIn1 + numIn2;
						break;
			case '-' : result = numIn1 - numIn2;
						break;
			case '*' : result = numIn1 * numIn2;
						break;
			case '/' : result = numIn1 / numIn2;
						break;
		}
		System.out.print("Result: " + result);
	}
}