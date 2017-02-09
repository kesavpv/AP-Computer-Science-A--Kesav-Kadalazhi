package activities.unit4;

public class Lesson_35_Activity
{
	public static void main(String[] args)
	{
		// System.out.println(randomize(10, 30));
		System.out.println(randomize(10));
		// System.out.println(randomize(20.0, 30.0));
		// System.out.println(randomize(20.0));
	}

	public static int randomize(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}

	public static int randomize(int max) {
		return (int) (Math.random() * max);
	}

	public static double randomize(double min, double max) {
		return Math.random() * (max - min) + min;
	}

	public static double randomize(double max) {
		return Math.random() * max;
	}
}