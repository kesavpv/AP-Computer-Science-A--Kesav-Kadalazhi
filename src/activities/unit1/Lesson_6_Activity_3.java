package activities.unit1;

import java.util.Scanner;

public class Lesson_6_Activity_3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Please input a decimal number:");
		double num = scan.nextDouble();

		System.out.println("Answer: " + Math.round((num - (int) num) * 100));

		scan.close();
	}
}