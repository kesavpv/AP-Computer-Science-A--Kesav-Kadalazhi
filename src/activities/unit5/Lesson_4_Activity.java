package activities.unit5;

import java.io.IOException;

public class Lesson_4_Activity
{
	public static void main(String str[]) throws IOException
	{
		Vehicle v1 = new Vehicle(17);

		System.out.println(v1);

		for (int i = 1; i < 5; i++)
		{
			v1.forward();
			System.out.println(v1);
		}
		System.out.println(v1.getLocation());

		for (int i = 1; i < 10; i++)
		{
			int d = (int) (Math.random() * 2);
			if (d == 0)
				v1.forward();
			else
				v1.backward();
			System.out.println(v1);

		}

		Vehicle v2 = new Vehicle(87);
		System.out.println(v2.getLocation());

		Vehicle v3 = new Vehicle(-18);
		System.out.println(v3);
		v3.backward();
		System.out.println(v3.getLocation());
		v3.backward();
		System.out.println(v3.getLocation());
		v3.backward();
		System.out.println(v3.getLocation());
		v3.backward();
		System.out.println(v3.getLocation());

	}
}

class Vehicle
{

	private int location;

	public Vehicle() {
		location = 0;
	}

	public Vehicle(int loc)
	{
		this();
		if (loc >= -20 && loc <= 20)
			location = loc;
	}

	public void forward()
	{
		if (location != 20)
			location++;
	}

	public void backward()
	{
		if (location != -20)
			location--;
	}

	public int getLocation() {
		return location;
	}

	public String toString()
	{
		String string = "";

		for (int i = -20; i < location; i++)
			string += " ";
		string += "@";

		return string;
	}

}