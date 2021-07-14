package studentDatabaseApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

	private String firstName = "";
	private String lastName = "";
	private int facultyYear = 0;
	private int studentId = 0;
	private List<String> courses = null;
	private int tuitionBalance = 0;
	private static final int tuitionFee = 600;
	
	private static int idCounter = 1000;
	
	
	// 1. Constructor : prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Input student's first name: ");
		firstName = in.nextLine();
		
		System.out.println("Input student's last name: ");
		lastName = in.nextLine();
		
		System.out.println("\n1 - Freshman(1st year)\n2 - Sophomore(2nd year)\n3 - "
				+ "Senior\nInput faculty year: ");
		facultyYear = in.nextInt();
		//in.close();
		setStudentId();
		
		//System.out.println(firstName + " " + lastName + " " + facultyYear + " " + studentId);
		//enroll();
		
		
	}
	
	
	
	// 2. Generate an id - 5 digit - first number = grade level
	private void setStudentId() {
		idCounter++;
		//String fiveDigitID = String.valueOf(facultyYear) + String.valueOf(idCounter);
		//String fiveDigitID = facultyYear + "" + idCounter;
		this.studentId = Integer.parseInt(facultyYear + "" + idCounter);
		 
		//this.studentId = Integer.parseInt(fiveDigitID);
	}
	
	
	// 3. Enroll in courses - History 101, Mathematics 101, English 101, Chemistry 101, Computer S 101
	
	public void enroll() {
		
		courses = new ArrayList<>();
		while(true) {
		System.out.print("Enter course to enroll (enter Q to quit): ");
		Scanner scanner = new Scanner(System.in);
		String course = scanner.nextLine();
		if (!course.equals("Q") && !course.equals("q")) {
			courses.add(course);
			tuitionBalance += tuitionFee;
		}
		else {
			break;
		}
		}
		//System.out.println("Enrolled in: " + courses);
		
	}
	
	
	// View balance 
	public void viewBalance() {
		System.out.println("Your balance is: " + tuitionBalance);
	}
	
	
	// Pay tuition
	public void payTuition() {
		System.out.println("Tuition Balance: " + tuitionBalance);
		System.out.println("Enter payment: ");
		Scanner scanner = new Scanner(System.in);
		int payment = scanner.nextInt();
		tuitionBalance -= payment;
		System.out.println("You have payed the amount of " + payment);
		viewBalance();
	}
	
	
	// Show status
//	public void showStudentInfo() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Name: ");
//		builder.append(firstName);
//		builder.append(" ");
//		builder.append(lastName);
//		builder.append("\n");
//		builder.append("Faculty year: ");
//		builder.append(facultyYear);
//		builder.append("\n");
//		builder.append("Id: ");
//		builder.append(studentId);
//		builder.append("\n");
//		builder.append("Courses: ");
//		builder.append(courses);
//		builder.append("\n");
//		builder.append("Total balance: ");
//		builder.append(tuitionBalance);
//		System.out.println(builder.toString());
//	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Name: ");
		builder.append(firstName);
		builder.append(" ");
		builder.append(lastName);
		builder.append("\n");
		builder.append("Faculty year: ");
		builder.append(facultyYear);
		builder.append("\n");
		builder.append("Id: ");
		builder.append(studentId);
		builder.append("\n");
		builder.append("Courses: ");
		for (String course : courses) {
			builder.append(course);
			builder.append("\n");
		}
		
		//builder.append("\n");
		builder.append("Total balance: ");
		builder.append(tuitionBalance);
		return builder.toString();
	}
	
}

























