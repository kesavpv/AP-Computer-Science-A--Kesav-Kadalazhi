package assignments;

import java.util.Scanner;

public class Assignment5
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first String:");
		String word = scan.nextLine();
		System.out.println("Enter the replacement String:");
		String replacement = scan.nextLine();

		scan.close();
		
		if(word.indexOf('%') == -1) {
			System.out.println("Error: no %");
			return;
		}
		
		for(int i = 0;i < word.length();i++) {
			if(((word.charAt(i) < 65 || word.charAt(i) > 90) 
						&& (word.charAt(i) < 97 || word.charAt(i) > 122 ) 
					&& ( word.charAt(i) != ' ' && word.charAt(i) != '\t' && word.charAt(i) != '%'))) {
				System.out.println("Error: Incorrect characters");
				return;
			}
		}
		
		System.out.println(word.substring(0, word.indexOf('%')) 
				+ replacement 
				+ word.substring(word.indexOf('%')+1));
	}
}
