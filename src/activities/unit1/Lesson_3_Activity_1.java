package activities.unit1;

import java.util.Scanner;

public class Lesson_3_Activity_1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Hi " + name + ", nice to see you.");

		scan.close();
	}
}