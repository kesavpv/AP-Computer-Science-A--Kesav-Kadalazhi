package activities.unit1;

import java.util.Scanner;

public class Lesson_5_Activity_2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Input four integers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();

		System.out.println(num1 + num2 + num3 + num4);

		scan.close();
	}
}
