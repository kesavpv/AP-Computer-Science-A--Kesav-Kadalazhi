package activities.unit1;

import java.util.Scanner;

public class Lesson_5_Activity_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a price:");
		double money = scan.nextDouble();
		
		System.out.println("Change from $20: $"+(20.0-money));
		
		scan.close();
	}
}
