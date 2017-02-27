package activities.unit4;

public class Lesson_33_Activity_4
{
	public static void main(String[] args)
	{
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		reverse(array);

		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

	public static void reverse(int[] array)
	{
		int[] copy = new int[array.length];
		
		for (int i = 0;i < array.length;i++)
			copy[i] = array[i];
		
		for(int i = 0;i < array.length;i++)
			array[i] = copy[array.length-i-1];
	}
}