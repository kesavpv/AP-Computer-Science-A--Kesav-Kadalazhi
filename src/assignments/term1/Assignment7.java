package assignments.term1;

import java.util.Scanner;

public class Assignment7
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a base ten number between 0 and 255, inclusive.");
		int num1 = scan.nextInt();
		System.out.println("Enter a base ten number between 0 and 255, inclusive.");
		int num2 = scan.nextInt();
		
		System.out.println("\nFirst binary number:");
		printBin(convertToBinary(num1));
		System.out.println("\n\nSecond binary number:");
		printBin(convertToBinary(num2));
		System.out.println("\n\nAdded:");
		printBin(convertToBinary(num1 + num2));
		
		scan.close();
	}
	
	public static int[] convertToBinary(int b) 
	{
		int binary[] = new int[8], i = 7;
		
		while(i >= 0)
		{
			binary[8-i-1] = b / (int)Math.pow(2, i) > 0 ? 1 : 0;
			b %= Math.pow(2, i);
			i--;
		}
		
		return binary;
	}
	
	public static void printBin(int b[]) {
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
	}
	
	public int[] addBin(int a, int b) {
		return convertToBinary(a+b);
	}
}
