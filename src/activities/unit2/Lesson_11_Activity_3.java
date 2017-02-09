package activities.unit2;

import java.util.Scanner;

public class Lesson_11_Activity_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int num1 = scan.nextInt();
		System.out.print("Enter another integer: ");
		int num2 = scan.nextInt();
		
		if(num1 == num2) {
			System.out.println("YES");
		}
		
		scan.close();
	}
}