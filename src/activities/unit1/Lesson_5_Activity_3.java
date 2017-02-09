package activities.unit1;

import java.util.Scanner;

public class Lesson_5_Activity_3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Input the radius:");
		int radius = scan.nextInt();

		System.out.println("Circumference: " + 2 * 3.14 * radius);
		System.out.println("Area: " + 3.14 * radius * radius);

		scan.close();
	}
}
