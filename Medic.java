package calculator;

import java.util.Scanner;

public class Medic
{
	public static void main(String[]args)
	{
		Voting.menu();
	}
	static String stringIn()
	{
		Scanner input = new Scanner (System.in);
		String in = input.next();
		return in;
	}
	static int intIn()
	{
		Scanner input = new Scanner (System.in);
		int in = input.nextInt();
		return in;
	}
	static void print(String info)
	{
		System.out.print(info);
	}
	static void println(String info)
	{
		System.out.println(info);
	}
	static int sTOi (String info)
	{
		return Integer.parseInt(info);
	}
}
