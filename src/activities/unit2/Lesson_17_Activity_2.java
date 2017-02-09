package activities.unit2;

import java.util.Scanner;

public class Lesson_17_Activity_2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int flag = 1;

		double lat = 0, lon = 0;
		double maxLat = 0, maxLon = 0;

		while (flag == 1)
		{
			System.out.println("Please enter the latitude:");
			lat = scan.nextDouble();
			System.out.println("Please enter the longitude:");
			lon = scan.nextDouble();

			System.out.println("Would you like to enter another location?");
			flag = scan.nextInt();

			if (lat > -90 && lat <= 90 && lat > maxLat)
				maxLat = lat;
			if (lon > -180 && lon <= 180 && lon > maxLon)
				maxLon = lon;
			if (lat < -90 || lat > 90 || lon < -180 || lon > 180)
				System.out.println("Incorrect Latitude or Longitude");
		}

		System.out.println("Farthest North: ");
		System.out.println("Farthest South: ");
		System.out.println("Farthest East: ");
		System.out.println("Farthest West: ");

		scan.close();
	}
}