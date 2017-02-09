package activities.unit3;

import java.util.Scanner;

public class Lesson_24_Activity_3
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number between 0 and 100:");
		int num = scan.nextInt();

		if (num < 100 && num > 0)
		{
			for (int i = num; i <= 100; i += 20)
			{
				for (int j = i; j < i + 20; j++)
				{
					System.out.print(j + " ");
					if (j == 100)
						break;
				}
				System.out.println();
			}
		}
		else
			System.out.println("error");

		scan.close();
	}
}
