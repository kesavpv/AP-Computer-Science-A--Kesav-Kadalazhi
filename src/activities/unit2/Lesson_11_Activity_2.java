package activities.unit2;

import java.util.Scanner;

public class Lesson_11_Activity_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		double input = scan.nextDouble();
		
		if(input == 48.729) {
			System.out.println("YES");
		}
		
		scan.close();
	}
}