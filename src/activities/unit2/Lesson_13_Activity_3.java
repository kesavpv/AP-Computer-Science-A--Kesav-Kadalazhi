package activities.unit2;

import java.util.Scanner;

public class Lesson_13_Activity_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter two integers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1);
		} else if(num1 < num2) {
			System.out.println(num2);
		} else {
			System.out.println("EQUAL");
		}
		
		scan.close();
	}
}