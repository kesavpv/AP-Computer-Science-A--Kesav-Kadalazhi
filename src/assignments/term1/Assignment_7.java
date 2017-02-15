package assignments.term1;

import java.util.Scanner;

public class Assignment_7
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
		
		if( num1+num2 > 255)
			System.out.println("Error: overflow");
		
		printBin(addBin(convertToBinary(num1), convertToBinary(num2)));
		
		scan.close();
	}
	
	public static int[] convertToBinary(int b) 
	{
		int binary[] = new int[8], i = 7;
		
		for(;i >= 0;i--)
		{
			binary[7-i] = ( b / (int)Math.pow(2, i) ) > 0 ? 1 : 0;
			b %= Math.pow(2, i);
		}
		
		return binary;
	}
	
	public static void printBin(int b[]) {
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
	}
	
	public static int[] addBin(int[] a, int[] b)
	{
		int sum[] = new int[8], carry = 0;
		
		for(int i = 7; i >= 0;i--)
		{
			switch(a[i] + b[i] + carry)
			{
				case 3:
				{
					carry = 1;
					sum[i] = 1;
					break;
				}
				case 2:
				{
					carry = 1;
					sum[i] = 0;
					break;
				}
				case 1:
				{
					carry = 0;
					sum[i] = 1;
					break;
				}
				case 0:
				{
					carry = 0;
					sum[i] = 0;
					break;
				}
				default: break;
			}
		}
		
		return sum;
	}
}
