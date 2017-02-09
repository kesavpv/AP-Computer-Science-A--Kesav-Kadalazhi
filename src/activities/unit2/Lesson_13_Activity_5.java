package activities.unit2;

import java.util.Scanner;

public class Lesson_13_Activity_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1 = (int)(Math.random()*12+1);
		int num2 = (int)(Math.random()*12+1);
		
		int expectedProduct = num1 * num2;
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println("Enter the product");
		int actualProduct = scan.nextInt();
		
		if(expectedProduct == actualProduct) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong");
		}
		
		scan.close();
	}
}