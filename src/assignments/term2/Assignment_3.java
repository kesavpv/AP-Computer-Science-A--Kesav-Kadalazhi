package assignments.term2;

import java.util.ArrayList;

public class Assignment_3
{
	public static void main(String[] args)
	{
		Person p = new Person("John", "Doe");
		  System.out.println("printing person:\n");
		  System.out.println(p);

		  Student s = new Student("Sallie", "Smithers", 7);
		  System.out.println("\n\nprinting student:\n");
		  System.out.println(s);

		  System.out.println("\n\nprinting highschoolstudent:\n");
		  HighSchoolStudent h = new HighSchoolStudent("Bert", "Smith", 11, 3.67);
		  System.out.println(h);

		  ArrayList<Student> stu = new ArrayList<Student>();
		  stu.add(new HighSchoolStudent("Jem", "Finch", 11, 3.4));
		  stu.add(new Student("Scout", "Finch", 4));
		  stu.add(new HighSchoolStudent("Natalie", "Adams", 11, 2.4));
		  stu.add(new HighSchoolStudent("Boo", "Radley", 12, 1.7));
		  stu.add(new HighSchoolStudent("Atticus", "Finch", 12, 4.8));
		  stu.add(new Student("Elaine", "Benes", 9));
		  stu.add(new Student("Patrick", "Henry", 11));

		  ArrayList<Teacher> tea = new ArrayList<Teacher>();
		  tea.add(new Teacher("Ada", "Lovelace", "Mathematics"));
		  tea.add(new Teacher("Albert", "Einstein", "Physics"));                   
		  tea.add(new Teacher("Grace", "Hopper", "Computer Science"));
		  tea.add(new Teacher("Alan", "Turing", "Mathematics"));
		  tea.add(new Teacher("Marie", "Curie", "Chemistry"));
		  tea.add(new Teacher("Dolly", "Madison", "Government"));
		  tea.add(new Teacher("Maya", "Angelou", "English Composition"));

		  School sch = new School(stu, tea);
		  System.out.println("\n\nprinting school: \n");
		  System.out.println(sch);

		  System.out.println("\n\njust seniors: \n" + sch.getGradeLevel(12));
	}
}

class Person
{
	private String firstName, lastName;

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
	private static int studentId = 0;
	private int level;

	public Student(String firstName, String lastName, int level)
	{
		super(firstName, lastName);

		if (level >= 0 && level <= 12)
			this.level = level;
		else
			this.level = 0;
		
		studentId++;
	}
	
	public int getLevel() {
		return level;
	}
	
	public String toString() {
		return super.toString()+"\n   Grade Level: "+level+"\n   ID: "+studentId;
	}
}

class HighSchoolStudent extends Student
{
	private double gpa;
	
	public HighSchoolStudent(String firstName, String lastName, int level, double gpa)
	{
		super(firstName, lastName, level);
		
		if(gpa >= 0 && gpa <= 5)
			this.gpa = gpa;
		else
			this.gpa = 0;
	}
	
	public String toString() {
		return super.toString()+"\n   GPA: "+gpa;
	}
}

class Teacher extends Person
{
	private String subject;
	
	public Teacher(String firstName, String lastName, String subject)
	{
		super(firstName, lastName);
		this.subject = subject;
	}
	
	public String toString() {
		return super.toString()+"\n   Subject: "+subject;
	}
}

class School
{
	private ArrayList<Student> students;
	private ArrayList<Teacher> teachers;
	
	public School(ArrayList<Student> students, ArrayList<Teacher> teachers)
	{
		this.students = students;
		this.teachers = teachers;
	}
	
	public String getGradeLevel(int level)
	{
		String students = "";
		
		for(Student student: this.students)
			if(student.getLevel() == level)
				students += student.toString();
		
		return students;
	}
	
	public String toString()
	{
		String toString = "\nFaculty:\n";
		
		for(Teacher teacher: teachers)
			toString += teacher.toString()+"\n";

		toString += "\nStudent Body:\n";
		
		for(Student student: students)
			toString += student.toString()+"\n";
		
		return toString;
	}
}