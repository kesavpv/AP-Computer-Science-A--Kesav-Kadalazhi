package activities.unit3;

import java.util.Scanner;

public class Lesson_22_Activity_1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String value = scan.nextLine();
		
		for(int i=0;i<value.length();i++) {
			System.out.println(value.charAt(i));
		}
		
		scan.close();
	}
}
