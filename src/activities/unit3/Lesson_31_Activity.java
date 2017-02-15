package activities.unit3;

import java.util.Scanner;

public class Lesson_31_Activity
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number in base 8:");
		int num = Integer.parseInt(scan.next(), 8);
		
		System.out.println(num);
	}
}
