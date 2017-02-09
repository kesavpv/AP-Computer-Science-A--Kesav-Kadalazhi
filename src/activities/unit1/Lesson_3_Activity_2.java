package activities.unit1;

import java.util.Scanner;

public class Lesson_3_Activity_2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter three names: ");

		String name1 = scan.nextLine();
		String name2 = scan.nextLine();
		String name3 = scan.nextLine();

		System.out.println(name3 + " " + name2 + " " + name1);

		scan.close();
	}
}
