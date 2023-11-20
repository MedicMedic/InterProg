package calculator;
import java.util.*;

public class Act2 
{
	static double num1, num2, res;
	static char operator;
	
	public static void main (String[] args)
	{
		input();
		process();
		output();
	}
	public static void input()
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Enter number 1: ");
		num1 = input.nextInt();
		System.out.print("Enter number 2: ");
		num2 = input.nextInt();
		System.out.print("Input operation: ");
		operator = input.next().charAt(0);
	}
	public static void process()
	{
		switch (operator)
		{
			case '+' : res = num1 + num2;
						break;
			case '-' : res = num1 - num2;
						break;
			case '*' : res = num1 * num2;
						break;
			case '/' : res = num1 / num2;
						break;
		}
	}
	public static void output()
	{
		System.out.print("Result: " + res);
	}
}
