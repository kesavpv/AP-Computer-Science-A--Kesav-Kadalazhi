package activities.unit1;

import java.util.Scanner;

public class Lesson_10_Activity_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter two numbers: ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		System.out.println("The difference is: "+(double)((int)(num1*1000)-(int)(num2*1000))/1000);
		
		scan.close();
		
	}
}