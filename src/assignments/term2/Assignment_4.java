package assignments.term2;

public class Assignment_4
{
}

class Time2 implements Comparable<Time2>
{
	private int hour;
	private int minute;

	/**
	 * Default constructor that sets time to 0000.
	 */
	public Time2()
	{
		hour = 0;
		minute = 0;
	}

	/**
	 * If h is between 1 and 23 inclusive, set the hour to h. Otherwise, set the
	 * hour to 0. If m is between 0 and 59 inclusive, set the minutes to m.
	 * Otherwise, set the minutes to 0.
	 */
	public Time2(int hour, int minute)
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

	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public String difference(Time2 t)
	{
		return "";
	}
	
	@Override
	public int compareTo(Time2 o)
	{
		if(getHour()*60+getMinute() < o.getHour()*60+o.getMinute())
			return -1;
		else if(getHour()*60+getMinute() < o.getHour()*60+o.getMinute())
			return 1;
		else
			return 0;
	}
}