package calculator;

public class Database 
{
	private static String[][] voteOptions = {{"Ur Mom", "0"}, {"Joe Mama", "0"}, {"Mak Kau Hijau", "0"}};
	
	private static String[][]voter = {{"Never", "Gonna", "F"}, {"Give", "You", "F"}, {"Up", "rickroll", "F"}};
	
	static String voterName (int info)
	{
		return voter[info][0];
	}
	static String voterPass (int info)
	{
		return voter[info][1];
	}
	static String voteOps (int info)
	{
		return voteOptions[info][0];
	}
	static String voteCount (int info)
	{
		return voteOptions[info][1];
	}
	static String voteStat (int info)
	{
		return voter [info][2];
	}
	static void updateCount(int info)
	{
		String votes = voteOptions[info][1];
		int intvote = Medic.sTOi(votes);
		intvote++;
		voteOptions[info][1] = "" + intvote;
	}
	static void updateStat(int info)
	{
		voter[info][2] = "T";
	}
}
