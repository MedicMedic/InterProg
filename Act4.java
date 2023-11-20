package calculator;
import java.util.*;

public class Act4 
{
	public static void main (String[] args)
	{
		int operation = Marianne.startup();
		int counter = Marianne.selectOpe(operation);
		Marianne.num_input(counter);
		Marianne.opeDirectory(operation);
		Marianne.resprint();
	}
}
