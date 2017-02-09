package activities.unit2;

import java.util.Scanner;

public class Lesson_13_Activity_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("What is the temperature?");
		double num = scan.nextDouble();
		
		if(num > 102 || num < 99) {
			System.out.println("WARNING");
		} else {
			System.out.println("Temperature is OK");
		}
		
		scan.close();
	}
}