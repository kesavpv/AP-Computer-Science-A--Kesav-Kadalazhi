package assignments.term1;

import java.util.Scanner;

public class Assignment1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your test grades.");
		System.out.print("Test 1: ");
		double test1 = scan.nextDouble();
		System.out.print("Test 2: ");
		double test2 = scan.nextDouble();
		System.out.print("Test 3: ");
		double test3 = scan.nextDouble();

		System.out.println("\nPlease enter your quiz grades.");
		System.out.print("Quiz 1: ");
		int quiz1 = scan.nextInt();
		System.out.print("Quiz 2: ");
		int quiz2 = scan.nextInt();

		System.out.println("\nPlease enter your homework average.");
		double hwAvg = scan.nextDouble();

		double testAvg = (test1 + test2 + test3) / 3.0;
		double quizAvg = (quiz1 + quiz2) / 2.0;

		double finalGrade = .4 * testAvg + .35 * quizAvg + .25 * hwAvg;

		System.out.println("\nTest Average: " + testAvg);
		System.out.println("Quiz Average: " + quizAvg);
		System.out.println("Final Grade: " + finalGrade);

		scan.close();
	}
}
