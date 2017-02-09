package activities.unit3;

public class Lesson_30_Activity
{
	public static String[] list = {};

	public static void main(String args[])
	{
		String list[] = { "every", " near ing ", " checking", "food ", "stand", "value " };

		for (int i = 0; i < list.length; i++)
		{
			list[i] = list[i].trim();
			for (int j = 0; j < list[i].length(); j++)
				if (list[i].charAt(j) == ' ')
					list[i] = list[i].substring(0, j) + list[i].substring(j + 1);
		}
	}
}
