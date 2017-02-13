package assignments.term1;

import java.util.Scanner;

public class Assignment_2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter the Amount Paid:");
		double paid = scan.nextDouble();

		System.out.println("Please enter the Cost of the Item:");
		double cost = scan.nextDouble();

		int change = (int) Math.round(paid * 100) - (int) Math.round(cost * 100);
		double changeCopy = 1.0 * change / 100;

		int quarters = change / 25;
		change %= 25;
		int dimes = change / 10;
		change %= 10;
		int nickels = change / 5;
		change %= 5;

		System.out.println("\nChange Owed: " + changeCopy);
		System.out.println("Pennies: " + change);
		System.out.println("Nickels: " + nickels);
		System.out.println("Dimes: " + dimes);
		System.out.println("Quarters: " + quarters);

		scan.close();
	}
}
