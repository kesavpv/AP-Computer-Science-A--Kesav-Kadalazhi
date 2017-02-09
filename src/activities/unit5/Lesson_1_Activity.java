package activities.unit5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson_1_Activity
{
	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);

		ArrayList<String> words = new ArrayList<String>();

		int length;
		String word = "";

		System.out.println("Please enter words, enter STOP to stop the loop.");

		while (true)
		{
			word = scan.nextLine();
			if (word.equals("STOP"))
				break;
			else
				words.add(word);
		}

		length = words.size();

		System.out.println(length);
		System.out.println(words);

		if (length > 2)
		{
			words.remove(0);
			words.remove(length - 2);
		}

		System.out.println(words);

		scan.close();

	}

}