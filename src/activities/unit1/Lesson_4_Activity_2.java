package activities.unit1;

import java.util.Scanner;

public class Lesson_4_Activity_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hi there. What is your name?");
		String name = scan.nextLine();
		
		System.out.println("Hi "+name+". How old are you?");
		int age = scan.nextInt();

		System.out.println("Hi "+name+", you will be 100 in "+(100-age)+" years.");
		
		scan.close();
	}
}