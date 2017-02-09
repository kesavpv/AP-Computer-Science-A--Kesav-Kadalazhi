package activities.unit5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson_2_Activity
{

	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);

		ArrayList<String> words = new ArrayList<String>();

		String input = "";

		System.out.println("Please enter words, enter STOP to stop the loop.");

		while (true)
		{
			input = scan.nextLine();
			if (input.equals("STOP"))
				break;
			else
				words.add(input);
		}

		for (String word : words)
		{
			if (word.contains("a"))
				System.out.println(word);
		}

		scan.close();

	}

}