package activities.unit2;

import java.util.Scanner;

public class Lesson_11_Activity_1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int input = scan.nextInt();

		if (input == 176)
			System.out.println("YES");

		scan.close();
	}
}