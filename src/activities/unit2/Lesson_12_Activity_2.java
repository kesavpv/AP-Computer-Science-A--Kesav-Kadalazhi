package activities.unit2;

import java.util.Scanner;

public class Lesson_12_Activity_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter two numbers: ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		if(num1 > num2) {
			System.out.println("\nLargest is: "+num1);
		} else {
			System.out.println("\nLargest is: "+num2);
		}
		
		scan.close();
	}
}