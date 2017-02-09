package activities.unit2;

import java.util.Scanner;

public class Lesson_13_Activity_1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an integer");
		int num = scan.nextInt();

		if (num >= 0)
			System.out.println("Positive");
		else
			System.out.println("Negative");
		
		scan.close();
	}
}