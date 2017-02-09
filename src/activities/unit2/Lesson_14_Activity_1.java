package activities.unit2;

import java.util.Scanner;

public class Lesson_14_Activity_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num = scan.nextInt();
		
		if(num >= 5 && num <= 76) {
			System.out.println("False");
		} else {
			System.out.println("True");
		}
		
		scan.close();
	}
}