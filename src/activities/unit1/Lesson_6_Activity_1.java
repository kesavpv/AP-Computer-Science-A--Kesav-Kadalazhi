package activities.unit1;

import java.util.Scanner;

public class Lesson_6_Activity_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input two integers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("The average is: "+1.0 * (num1 + num2)/2);
		
		scan.close();
	}
}
