package assignments.term1;

import java.util.Scanner;

public class Assignment_3
{
	public static void main(String[] args)
	{
		int day, month, days;

		String sign = "", birthmonth = "", birthday = "";

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
						"October", "November", "December" };

		String[] birthdays = { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth",
						"tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth",
						"seventeenth", "eighteenth", "nineteenth", "twentieth", "twenty-first", "twenty-second",
						"twenty-third", "twenty-fourth", "twenty-fifth", "twenty-sixth", "twenty-seventh",
						"twenty-eighth", "twenty-ninth", "thirtieth", "thirty-first" };

		Scanner scan = new Scanner(System.in);

		System.out.println("On what day of the month were you born? (number)");
		day = scan.nextInt();
		System.out.println("In which month were you born? (number)");
		month = scan.nextInt();

		scan.close();

		if (day <= 0 || day > 31 || month <= 0 || month > 12)
		{
			System.out.println("error");
			return;
		}

		days = (month - 1) * 31 + day;

		if (days <= 19 || days >= 363)
			sign = "Capricorn";
		else if (days >= 20 && days <= 49)
			sign = "Aquarius";
		else if (days >= 50 && days <= 82)
			sign = "Pisces";
		else if (days >= 83 && days <= 112)
			sign = "Aries";
		else if (days >= 113 && days <= 144)
			sign = "Taurus";
		else if (days >= 145 && days <= 175)
			sign = "Gemini";
		else if (days >= 176 && days <= 208)
			sign = "Cancer";
		else if (days >= 209 && days <= 239)
			sign = "Leo";
		else if (days >= 240 && days <= 270)
			sign = "Virgo";
		else if (days >= 271 && days <= 301)
			sign = "Libra";
		else if (days >= 302 && days <= 331)
			sign = "Scorpio";
		else if (days >= 332 && days <= 362)
			sign = "Sagittarius";

		for (int i = 0; i <= 12; i++)
		{
			if (i == month)
			{
				birthmonth = months[i - 1];
				break;
			}
		}

		for (int i = 0; i <= 31; i++)
		{
			if (i == day)
			{
				birthday = birthdays[i - 1];
				break;
			}
		}

		System.out.println("Your sign is " + sign);
		System.out.println("Your birthday is: " + birthmonth + " " + birthday);
	}
}
