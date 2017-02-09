package activities.unit2;

import java.util.Scanner;

public class Lesson_12_Activity_1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int num1 = scan.nextInt();
		System.out.println("Enter another integer: ");
		int num2 = scan.nextInt();
		System.out.println("Enter yet another integer: ");
		int num3 = scan.nextInt();

		int avg = (int) Math.round(1.0 * (num1 + num2 + num3) / 3);

		if (avg >= 89.5)
			System.out.println("ABOVE AVERAGE");

		scan.close();
	}
}