package activities.unit6;

import java.util.ArrayList;

public class Lesson_12_Fast_Start
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("String 1");
		list.add("String 2");
		list.add("String 3");
		list.add("String 4");
		list.add("String 5");
		list.add("String 6");
		list.add("String 7");
		list.add("String 8");
		list.add("String 9");
		list.add("String 10");
		
		System.out.println(list.get((int)(Math.random()*10)));
		System.out.println(list.get((int)(Math.random()*10)));
	}
}
