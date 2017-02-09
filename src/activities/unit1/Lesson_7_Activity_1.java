package activities.unit1;

import java.util.Scanner;

public class Lesson_7_Activity_1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a three digit number:");
		int num = scan.nextInt();

		System.out.println("Here are the digits:");
		System.out.println((num % 1000 - num % 100) / 100);
		System.out.println((num % 100 - num % 10) / 10);
		System.out.println(num % 10);

		scan.close();
	}
}