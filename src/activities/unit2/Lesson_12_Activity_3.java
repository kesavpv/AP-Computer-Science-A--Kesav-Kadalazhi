package activities.unit2;

import java.util.Scanner;

public class Lesson_12_Activity_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a test score: ");
		double num = scan.nextDouble();
		
		if(num <= 100 && num >= 0) {
			System.out.println("Valid");
		} else {
			System.out.println("Not Valid");
		}
		
		scan.close();
	}
}