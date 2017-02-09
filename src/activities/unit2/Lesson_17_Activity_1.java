package activities.unit2;

import java.util.Scanner;

public class Lesson_17_Activity_1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int n = 0, ct = 0, sum = 0;

		System.out.println("Enter the Scores:");

		while (n != -1)
		{
			n = scan.nextInt();
			sum += n;
			ct++;
		}
		System.out.println("The average is: " + 1.0 * (sum + 1) / (ct - 1));

		scan.close();
	}
}