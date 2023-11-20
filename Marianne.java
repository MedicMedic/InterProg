package calculator;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Marianne 
{
	public static String input(String info)
	{
		Scanner input = new Scanner (System.in);
		System.out.print(info);
		String in = input.nextLine();
		return in;
	}
	public static void print(String info)
	{
		System.out.println(info);
	}
	public static double result = 0;
	public static double[] numbers;
	public static String res = "";
	public static int startup()
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println("WELCOME!");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Average\n"
				+ "6.Concatenate\n7.Round to whole number\n8.Convert to percentage"
				+ "\n9.Area of Circle (input radius)\n10. Perimeter (Circle)\n11. Area of Square\n"
				+ "12. Perimeter of Square\n13.Celcius to Fahrenheit\n14.Fahrenheit to Celcius\n15.BMI (first number is height)"
				+ "\n16. Area (Rectangle)\n17. Perimeter (Rectangle)\n18. Exponent(first number is base)");
		System.out.print("Select operation: ");
		int numnum = input.nextInt();
		return numnum;
	}
	public static void error(int err)
	{
		switch (err)
		{
			case 1: System.out.println("Number of numbers must be at least 2"); 
				break;
			case 2: System.out.println("Wrong operator");
				break;
		}
	}
	public static void num_input(int count)
	{
		Scanner input = new Scanner (System.in);
		numbers = new double [count];
		for (int i = 0; i <= (count - 1); i++)
		{
			System.out.print("Choose Number " + (i+1) + ": ");
			numbers [i] = input.nextDouble();
		}
	}
	public static int selectOpe(int operation)
	{
		Scanner input = new Scanner (System.in);
		int numnum = 0;
		if (operation >= 1 && operation <= 6)
		{
			System.out.print("Enter number of numbers: ");
			int nn = input.nextInt();
			if (nn <= 1)
			{
				error(1);
			}
			else
			{
				numnum = nn;
			}
		}
		else if (operation >= 7 && operation <= 14)
		{
			numnum = 1;
		}
		else if (operation >= 15 && operation <= 18)
		{
			numnum = 2;
		}
		else
		{
			error(2);
		}
		return numnum;
	}
	public static void opeDirectory(int operation)
	{
		switch (operation)
		{
			case 1: result = addition();
				break;
			case 2: result = subtraction();
				break;
			case 3: result = multiplication();
				break;
			case 4: result =  division();
				break;
			case 5: result =  average();
				break;
			case 6: res = concatenate();
				break;
			case 7: result =  round();
				break;
			case 8: res =  percentage();
				break;
			case 9: result =  areacircle();
				break;
			case 10: result =  pericircle();
				break;
			case 11: result =  areasq();
				break;
			case 12: result =  perisq();
				break;
			case 13: result =  ctof();
				break;
			case 14: result =  ftoc();
				break;
			case 15: result =  bmi();
				break;
			case 16: result =  arearec();
				break;
			case 17: result =  perirec();
				break;
			case 18: result =  exponent();
				break;
			default: break;
		}
	}
	public static double addition()
	{
		double add = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			add += numbers[(i)];
		}
		return add;
	}
	public static double subtraction()
	{
		double sub = 0;
		for (int i = 1; i < numbers.length; i++)
		{
			sub = numbers[0];
			sub -= numbers[(i)];
		}
		return sub;
	}
	public static double multiplication()
	{
		double mul = 0;
		for (int i = 1; i < numbers.length; i++)
		{
			mul = numbers[0];
			mul *= numbers[(i)];
		}
		return mul;
	}
	public static double division()
	{
		double div = 0;
		for (int i = 1; i < numbers.length; i++)
		{
			div = numbers[0];
			div /= numbers[(i)];
		}
		return div;
	}
	public static double average()
	{
		double add = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			add += numbers[(i)];
		}
		double ave = add/numbers.length;
		return ave;
	}
	public static String concatenate()
	{
		DecimalFormat df = new DecimalFormat("###");
		String conc = "";
		for (int i = 0; i < numbers.length; i++)
		{
			conc = "" + df.format(numbers[i]) + "";
		}
		System.out.println(conc);
		return conc;
	}
	public static int round()
	{
		int round = (int) Math.round(numbers[0]);
		return round;
	}
	public static String percentage()
	{
		double perc = numbers[0] * 100;
		String entage = perc + "%";
		return entage;
	}
	public static double areacircle()
	{
		double area = numbers[0] * numbers[0] * Math.PI;
		return area;
	}
	public static double pericircle()
	{
		double meter = 2 * Math.PI * numbers[0];
		return meter;
	}
	public static double areasq()
	{
		double area = numbers[0] * numbers[0];
		return area;
	}
	public static double perisq()
	{
		double meter = 4 * numbers[0];
		return meter;
	}
	public static double ctof()
	{
		double fah = numbers[0] * 1.8 + 32;
		return fah;
	}
	public static double ftoc()
	{
		double cel = (numbers[0] - 32) * 0.556 ;
		return cel;
	}
	public static double bmi()
	{
		double bmi = numbers[1] / (numbers[0] * numbers [0]);
		return bmi;
	}
	public static double arearec()
	{
		double area = numbers [0] * numbers [1];
		return area;
	}
	public static double perirec()
	{
		double meter = (2*numbers[0]) + (2*numbers[1]);
		return meter;
	}
	public static double exponent()
	{
		double exp = 1;
		for (int i = 0; i <= numbers[1]; i++)
		{
			exp *= numbers[0];
		}
		return exp;
	}
	public static void resprint()
	{
		if (res == "")
		{
			res = "" + result + "";
		}
		System.out.print("Result = " + res);
	}
}
