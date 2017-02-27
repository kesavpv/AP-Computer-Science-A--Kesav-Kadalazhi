package activities.unit4;

public class Lesson_33_Activity_5
{
	public static void main(String[] args)
	{
		int[] array = { 1, 2, 3, 4, 5 };
		
		insertValue(array, 100, 2);

		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

	public static void insertValue(int[] array, int value, int index)
	{
		for(int i = array.length-1;i > index;i--)
			array[i] = array[i-1];
		
		array[index] = value;
	}
}

