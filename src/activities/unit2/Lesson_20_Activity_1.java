package activities.unit2;

import java.util.Scanner;

public class Lesson_20_Activity_1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter two numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		int n;

		if (num1 % 2 == 0)
			n = num1;
		else
			n = num1 + 1;

		while (n <= num2)
		{
			System.out.print(n + " ");
			n += 2;
		}

		scan.close();
	}
}