package activities.unit2;

import java.util.Scanner;

public class Lesson_13_Activity_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an integer");
		int num1 = scan.nextInt();
		
		if(num1 == 4) {
			System.out.println("A");
		} else if(num1 == 3) {
			System.out.println("B");
		} else if(num1 == 2) {
			System.out.println("C");
		} else if(num1 == 1) {
			System.out.println("D");
		} else if(num1 == 0) {
			System.out.println("F");
		}
		
		scan.close();
	}
}