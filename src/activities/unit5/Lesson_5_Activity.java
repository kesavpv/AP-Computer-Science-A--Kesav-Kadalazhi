package activities.unit5;

import java.io.IOException;

public class Lesson_5_Activity
{
	public static void main(String str[]) throws IOException
	{
		Student s1 = new Student();
		System.out.println(s1);

		Student s2 = new Student();
		System.out.println(s2);

		Student s3 = new Student();
		System.out.println(s3);

		Student s4 = new Student("Mrs.", "Dovi", 7, 3.4);
		System.out.println(s4);
	}
}

class Student
{
	private String firstName = "";
	private String lastName = "";

	private int gradeLevel;
	private double gpa;
	private static int id = 0;

	public Student()
	{
		firstName = "None";
		lastName = "None";
		gradeLevel = 0;
		gpa = 0.0;

		id++;
	}

	public Student(String firstName, String lastName, int gradeLevel, double gpa)
	{
		this.firstName = firstName;
		this.lastName = lastName;

		if (this.gradeLevel >= 0 && this.gradeLevel <= 12)
			this.gradeLevel = gradeLevel;
		else
			this.gradeLevel = 0;

		if (this.gpa >= 0.0 && this.gpa <= 4.5)
			this.gpa = gpa;
		else
			this.gpa = 0.0;

		id++;
	}

	public String toString() {
		return lastName + ", " + firstName + "\nGPA: " + gpa + "\nGrade Level: " + gradeLevel + " id # " + id;
	}

}
