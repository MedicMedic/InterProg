package calculator;
import java.util.Scanner;

public class Act3 
{
	public static void main (String[] args)
	{
		int okay = infoinput();
		result(okay);
	}
	public static int infoinput()
	{
		String[][] loginfos= {{"user1", "pass1"}, {"user2","pass2"}, {"user3", "pass3"}};
		
		Scanner input = new Scanner(System.in);
		System.out.print("Username: ");
		String inUser = input.next();
		System.out.print("Password: ");
		String inPass = input.next();
		
		int usepass = 0;
		
		for (int i = 0; i < 3; i++)
		{
			if (inUser.equals(loginfos[i][0]) & inPass.equals(loginfos[i][1]))
			{
				usepass = 1;
				break;
			}
		}
		return usepass;
	}
	
	public static void result(int confirmation)
	{
		if (confirmation == 1)
		{
			System.out.print("Successfully logged-in!");
		}
		else if (confirmation == 0)
		{
			System.out.print("Username or password is incorrect");
		}
		else
		{
			System.out.print("error");
		}
	}
}
