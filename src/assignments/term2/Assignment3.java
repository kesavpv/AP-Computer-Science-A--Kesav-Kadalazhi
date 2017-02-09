package assignments.term2;

import java.util.ArrayList;

public class Assignment3
{
	public static void main(String[] args)
	{

	}
}

class Person
{
	String firstName, lastName;

	public Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String toString() {
		return firstName + " " + lastName;
	}
}

class Student extends Person
{
	static int studentId = 0;
	int level;

	public Student(String firstName, String lastName, int level)
	{
		super(firstName, lastName);

		if (level >= 0 && level <= 12)
			this.level = level;
		else
			this.level = 0;
		
		studentId++;
	}
	
	public int gradeLevel() {
		return level;
	}
	
	public String toString() {
		return firstName+" "+lastName+"\n   Grade Level: "+level+"\n   ID: "+studentId;
	}
}

class HighSchoolStudent extends Student
{
	double gpa;
	
	public HighSchoolStudent(String firstName, String lastName, int level, double gpa)
	{
		super(firstName, lastName, level);
		
		if(gpa >= 0 && gpa <= 5)
			this.gpa = gpa;
		else
			this.gpa = 0;
	}
	
	public String toString() {
		return firstName+" "+lastName+"\n   Grade Level: "+level+"\n   ID: "+studentId+"\n   "+gpa;
	}
}

class Teacher extends Person
{
	String subject;
	
	public Teacher(String firstName, String lastName, String subject)
	{
		super(firstName, lastName);
		this.subject = subject;
	}
	
	public String toString() {
		return firstName+" "+lastName+"\n   Subject: "+subject;
	}
}

class School
{
	ArrayList<Student> students;
	ArrayList<Teacher> teachers;
}