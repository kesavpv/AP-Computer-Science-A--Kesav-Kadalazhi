package activities.unit3;

import java.util.Scanner;

public class Lesson_31_Activity
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		
		String word;
		int num = 0;
		
		System.out.println("Enter a number in base 8:");
		word = scan.next();
		
		
		if(word.length() > 8)
		{
			System.out.println("ERROR: Incorrect Octal Format");
			return;
		}
		else
		{
			try {
				num = Integer.parseInt(word, 8);
			} catch(NumberFormatException exception) {
				System.out.println("ERROR: Incorrect Octal Format");
			}
		}
		
		if(num != 0)
			System.out.println(num);
	}
}
