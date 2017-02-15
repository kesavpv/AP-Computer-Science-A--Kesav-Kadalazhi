package assignments.term1;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_6
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int n = 1, i = -1;

		int[] array1 = new int[10000], array2 = new int[10000];

		boolean flag = false;
		
		System.out.println("Enter the values for the first array, up to 10000 values, enter zero or a negative number to quit");
		while (n > 0)
		{
			n = scan.nextInt();
			i++;
			
			if (n > 0)
			{
				array1[i] = n;
				if(i > 0 && array1[i-1] > n)
					flag = true;
			}
			else
				break;
		}
		
		int length1 = i;
		
		n = 1;
		i = -1;

		System.out.println("Enter the values for the first array, up to 10000 values, enter zero or a negative number to quit");
		while (n > 0)
		{
			n = scan.nextInt();
			i++;
			
			if (n > 0)
			{
				array2[i] = n;
				if(i > 0 && array1[i-1] > n)
					flag = true;
			}
			else
				break;
		}

		int length2 = i;

		System.out.println("\nFirst Array: ");
		for (i = 0; i < array1.length; i++)
		{
			if (array1[i] <= 0)
				break;
			System.out.print(array1[i] + " ");
		}

		System.out.println("\n\nSecond Array: ");
		for (i = 0; i < array2.length; i++)
		{
			if (array2[i] <= 0)
				break;
			System.out.print(array2[i] + " ");
		}

		if(flag)
			System.out.println("\n\nERROR: Array not in correct order");
		else
		{
			int[] merged = new int[length1 + length2];
			
			System.out.println("\n\nMerged Array: ");
			
			for (i = 0; i < length1; i++)
				merged[i] = array1[i];
			
			for (i = 0; i < length2; i++)
				merged[length1 + i] = array2[i];
			
			Arrays.sort(merged);
			
			for (i = 0; i < merged.length; i++)
				System.out.print(merged[i]+" ");
		}

		scan.close();

	}
}
