package assignments.term2;

public class Assignment_1
{
	public static void main(String[] args)
	{
		Time time1 = new Time(14, 56);
		System.out.println("time1: " + time1);
		System.out.println("convert time1 to standard time: " + time1.convert());
		System.out.println("time1: " + time1);
		System.out.print("increment time1 five times: ");
		time1.increment();
		time1.increment();
		time1.increment();
		time1.increment();
		time1.increment();
		System.out.println(time1 + "\n");

		Time time2 = new Time(-7, 12);
		System.out.println("time2: " + time2);
		System.out.print("increment time2 67 times: ");
		for (int i = 0; i < 67; i++)
			time2.increment();
		System.out.println(time2);
		System.out.println("convert to time2 standard time: " + time2.convert());
		System.out.println("time2: " + time2 + "\n");

		Time time3 = new Time(5, 17);
		System.out.println("time3: " + time3);
		System.out.print("convert time3: ");
		System.out.println(time3.convert());

		Time time4 = new Time(12, 15);
		System.out.println("\ntime4: " + time4);
		System.out.println("convert time4: " + time4.convert());

		Time time5 = new Time(0, 15);
		System.out.println("\ntime5: " + time5);
		System.out.println("convert time5: " + time5.convert());

		Time time6 = new Time(24, 15);
		System.out.println("\ntime6: " + time6);
		System.out.println("convert time6: " + time6.convert());

		Time time7 = new Time(23, 59);
		System.out.println("\ntime7: " + time7);
		System.out.println("convert time7: " + time7.convert());
		time7.increment();
		System.out.println("increment time7: " + time7);
		System.out.println("convert time7: " + time7.convert());
	}

}

class Time
{
	private int hour;
	private int minute;

	/**
	 * Default constructor that sets time to 0000.
	 */
	public Time()
	{
		hour = 0;
		minute = 0;
	}

	/**
	 * If h is between 1 and 23 inclusive, set the hour to h. Otherwise, set the
	 * hour to 0. If m is between 0 and 59 inclusive, set the minutes to m.
	 * Otherwise, set the minutes to 0.
	 */
	public Time(int hour, int minute)
	{
		this();

		if (hour > 0 && hour < 24)
			this.hour = hour;

		if (minute > 0 && minute < 60)
			this.minute = minute;
	}

	/**
	 * Returns the time as a String of length 4 in the format: 0819. Notice that
	 * if the hour or minute is one digit, it should print a zero first. For
	 * example, 6 should print as 06.
	 */
	@Override
	public String toString()
	{
		String toString = "";

		if (hour < 10)
			toString += "0";

		toString += hour;

		if (minute < 10)
			toString += "0";

		toString += minute;

		return toString;
	}

	/**
	 * Returns the time as a String converted from military time to standard
	 * time. For example, 0545 becomes 5:45 AM and 1306 becomes 1:06 PM.
	 */
	public String convert()
	{
		String toString = "";
		
		if(hour == 0)
			toString += 12;
		else if(hour > 12)
			toString += hour-12;
		else
			toString += hour;
		toString += ":";
		
		if (minute < 10)
			toString += "0";
		toString += minute;

		if (hour < 12)
			toString += " AM";
		else
			toString += " PM";

		return toString;
	}

	/**
	 * Advances the time by one minute. Remember that 60 minutes = 1 hour.
	 * Therefore, if your time was 0359, and you add one minute, it becomes
	 * 0400. 2359 should increment to 0000.
	 */
	public void increment()
	{
		if (minute == 59)
		{
			if (hour == 23)
				hour = 0;
			else
				hour++;
			minute = 0;
		}
		else
			minute++;
	}

}