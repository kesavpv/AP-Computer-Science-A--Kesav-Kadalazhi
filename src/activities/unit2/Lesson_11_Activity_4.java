package activities.unit2;

import java.util.Scanner;

public class Lesson_11_Activity_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num1 = scan.nextInt();
		
		if(num1%2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
		scan.close();
	}
}