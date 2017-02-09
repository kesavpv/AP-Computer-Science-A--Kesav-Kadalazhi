package activities.unit1;

import java.util.Scanner;

public class Lesson_5_Activity_1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Input two decimals:");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();

		System.out.println(num1 - num2);

		scan.close();
	}
}
