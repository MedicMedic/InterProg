package main;
import java.util.*;
import employee.Employeeinfo;
import student.*;

public class MainProgram 
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		Studentinfo.Studentinfo();
		Acadinfo.Acadinfo();
		for (int count = 0; count <= 1; count++)
		{
			System.out.println("INPUT");
			System.out.print("Student Name: ");
			Studentinfo.studentname[count] = input.nextLine();
			System.out.print("Age: ");
			Studentinfo.age[count] = input.nextInt();
			input.nextLine();
			System.out.print("Student Gender: ");
			Studentinfo.gender[count] = input.nextLine();
			System.out.print("Student Address: ");
			Studentinfo.address[count] = input.nextLine();
			System.out.print("Contact Number: ");
			Studentinfo.contact[count] = input.nextLine();
			System.out.print("Father's Name: ");
			Studentinfo.father[count] = input.nextLine();
			System.out.print("Mother's Name: ");
			Studentinfo.mother[count] = input.nextLine();
			System.out.print("Student Number: ");
			Acadinfo.studentnum [count] = input.nextLine();
			System.out.print("Quiz 1: ");
			Acadinfo.quiz1 [count] = input.nextDouble();
			System.out.print("Quiz 2: ");
			Acadinfo.quiz2 [count] = input.nextDouble();
			System.out.print("Midterm: ");
			Acadinfo.midterm [count] = input.nextDouble();
			System.out.print("Final: ");
			Acadinfo._final [count] = input.nextDouble();
			Acadinfo.average [count] = (Acadinfo.quiz1 [count] + Acadinfo.quiz2 [count] + Acadinfo.midterm [count] + Acadinfo.midterm [count])/4;
			System.out.print("Student Attendance: ");
			Acadinfo.attendance [count] = input.nextDouble();
			input.nextLine();
			if (count < 1)
			{
				System.out.println("\n\nNEXT STUDENT\n");		
			}	
			else
			{
				System.out.println("\n\n=============================\n");
				
			}
		}
		for (int countm = 0; countm <= 1; countm++)
		{
			Studentinfo.display_student(countm);
			Employeeinfo.display_Employee();
			Acadinfo.displayEducDetails(countm);
			if (countm < 1)
			{
				System.out.println("NEXT STUDENT\n");		
			}	
			else
			{
				System.out.println("=============================\n");
			}
		}
	}
}
package student;

public class Studentinfo 
{
	public static String[]  studentname, address, father, mother, gender, contact;
	public static int[] age;
	public static void Studentinfo()
	{
		studentname= new String [2];
		address= new String [2];
		father= new String [2];
		mother= new String [2];
		gender = new String [2];
		contact = new String [2];
		
		age = new int [2];
	}
					
	public static void display_student(int counts)
	{
		System.out.print("STUDENT DETAILS\nStudent name: " + studentname[counts]
		+ "\nAge: " + age[counts] + "\nStudent Gender: " + gender[counts] + "\nStudent Address: " + address[counts] +
		"\nContact Number : " + contact[counts] + "\nFather's Name: " + father[counts] + "\nMother's Name: "
		+ mother[counts] + "\n");
	}
}
package student;

public class Acadinfo 
{
	public static String [] studentnum;
	public static double [] quiz1, quiz2, midterm, _final, average, attendance;
	
	public static void Acadinfo()
	{
		studentnum = new String [2];
		quiz1 = new double [2];
		quiz2 = new double [2];
		midterm = new double [2];
		_final = new double [2];
		average = new double [2];
		attendance = new double [2];
	}
	public static void displayEducDetails(int counta)
	{
		System.out.println("\nSTUDENT EDUCATION DETAILS\nStudent Number " + studentnum [counta] +
		"\nStudent Grade Average: " + average[counta] + "\nStudent Attendance: " + attendance[counta] + "%\n\n" );
	}
}
package employee;

public class Employeeinfo 
{
	public static void display_Employee()
	{
		String employeename = "Alexis L. Morales", designation = "Faculty", position = "Professor";
		System.out.println("\nEMPLOYEE'S DETAILS\nEmployee Name: " + employeename + "\nDesignation: " +
		designation + "\nAcademic Postion: " + position);
	}
}
