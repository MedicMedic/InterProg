package calculator;

import java.util.Scanner;

public class Voting 
{
	public static void signin()
	{
		Medic.println("VOTER LOG-IN");
		Medic.print("Username: ");
		String inUser = Medic.stringIn();
		Medic.print("Password: ");
		String inPass = Medic.stringIn();
		
		
		int i;
		
		for (i = 0; i < 3; i++)
		{
			if (inUser.equals(Database.voterName(i)) & inPass.equals(Database.voterPass(i)))
			{
				if (Database.voteStat(i) == "F")
				{
					vote(i);
				}
				else
				{
					Medic.println("You already voted!\n");
				}
			}
		}
	}
	public static void menu()
	{
		while (true)
		{
			Medic.println("MENU OPTIONS");
			Medic.println("1. Status\n2. Vote");
			Medic.print("Choice: ");
			int choice = Medic.intIn();
			Medic.println("");
			
			switch (choice)
			{
				case 1: showStatus();
						break;
				case 2: signin();
						break;
			}
		}
	}
	static void showStatus()
	{
		Medic.println("CANDIDATE LIST");
		for (int i = 0; i < 3; i++)
		{
			Medic.println((i+1) + ". " + Database.voteOps(i) + ": " + Database.voteCount(i));
		}
		Medic.println("");
	}
	static void vote (int voter)
	{
		Medic.println("\nCANDIDATE LIST");
		for (int i = 0; i < 3; i++)
		{
			Medic.println("" + (i+1) + ". " + Database.voteOps(i));
		}
		Medic.print("Vote: ");
		int voted = Medic.intIn();
		voted--;
		Database.updateCount(voted);
		Database.updateStat(voter);
		Medic.println("Thank you for voting!\n");
	}
}
