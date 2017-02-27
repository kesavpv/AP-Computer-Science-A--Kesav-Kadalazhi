package activities.unit4;

import java.lang.Math;

public class Lesson_33_Activity_2
{
	public static void main(String[] args)
	{
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		randomize(array);

		for (int i = 0; i < array.length; i++)
			System.out.print(array[i]+", ");
	}

	public static void randomize(int[] array) {
		for (int i = 0; i < array.length; i++)
			array[i] = (int) Math.round(Math.random() * 90 + 10);
	}
}
