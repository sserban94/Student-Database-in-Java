package studentDatabaseApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class StudentDatabaseApp {

	public static void main(String[] args) {
		// Here I ask how many users to add
		//List<Student> students = new ArrayList<>();
		
		System.out.println("How many students do you want to enroll?");
		Scanner scanner = new Scanner(System.in);
		int noStudents = scanner.nextInt();
		Student[] students = new Student[noStudents];
		
		// NEW LESSON HERE - FOR EACH doesn't initialize objects in array
			// the variable called student in the for each array is actually a local variable
//		for (Student student : students) {
//			System.out.println();
//			student = new Student();
//			student.enroll();
//			student.payTuition();
//		}
		
		for (int i = 0; i < noStudents; i++) {
			System.out.println();
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
		}
		
		System.out.println();
		for (Student student : students) {
			System.out.println(student.toString());
			System.out.println();
		}
		
//		Student stud1 =  new Student();
//		stud1.enroll();
//		stud1.payTuition();
//		
//		stud1.showStudentInfo();
		
		// Create n number of students
	}

}
