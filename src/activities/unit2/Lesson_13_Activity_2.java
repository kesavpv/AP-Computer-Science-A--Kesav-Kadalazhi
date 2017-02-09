package activities.unit2;

import java.util.Scanner;

public class Lesson_13_Activity_2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an integer");
		int num = scan.nextInt();

		if (num >= 60)
			System.out.println("passing");
		else
			System.out.println("failing");

		scan.close();
	}
}