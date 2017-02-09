package assignments.term1;

import java.util.Scanner;

public class Assignment4
{
	public static void main(String[] args)
	{
		int i;
		int mentions = 0, hashtags = 0;
		int length;

		boolean isRetweet = false;

		String tweet;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a tweet:");
		tweet = scan.nextLine();

		scan.close();

		length = tweet.length();

		for (i = 0; i < length; i++)
		{
			if (i < length - 2 && (tweet.charAt(i) == 'R' || tweet.charAt(i) == 'r')
							&& (tweet.charAt(i + 1) == 'T' || tweet.charAt(i + 1) == 't') && tweet.charAt(i + 2) == ':')
				isRetweet = true;

			if (i < length - 1 && tweet.charAt(i) == '#' && tweet.charAt(i + 1) != '\t' && tweet.charAt(i + 1) != ' ')	
				hashtags++;

			if (i < length - 1 && tweet.charAt(i) == '@' && tweet.charAt(i + 1) != '\t' && tweet.charAt(i + 1) != ' ')
				mentions++;
		}

		if (length > 140)
		{
			System.out.println("Excess Characters: " + (length - 140));
			return;
		}
		else
			System.out.println("Length Correct");

		System.out.println("Number of Mentions: " + mentions);
		System.out.println("Number of Hashtags: " + hashtags);

		if (isRetweet)
			System.out.println("The input was a retweet.");
		else
			System.out.println("The input was not a retweet.");
	}
}