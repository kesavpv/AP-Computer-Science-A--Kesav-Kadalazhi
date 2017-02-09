package activities.unit1;

import java.util.Scanner;

public class Lesson_7_Activity_2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a three digit number:");
		int num = scan.nextInt();

		int num1 = (num % 1000 - num % 100) / 100;
		int num2 = (num % 100 - num % 10) / 10;
		int num3 = num % 10;

		System.out.println("Here are the digits:");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		System.out.println("\n" + num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));

		scan.close();
	}
}