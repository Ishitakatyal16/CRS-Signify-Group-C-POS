/**
 * 
 */
package com.signify.client;

import java.util.Scanner;

import com.signify.client.CRSApplicationMenu;
import com.signify.service.StudentInterface;
import com.signify.service.StudentServiceOperations;

/**
 * @author Acer
 *
 */
public class CRSStudentMenu {
	
	public void displayStudentMenu() {
		// TODO Auto-generated method stub
      System.out.println("\nWELCOME TO STUDENT MENU");
      System.out.println("===========================\n");
      System.out.println("STUDENT MENU");
		System.out.println("1. Register for Course");
		System.out.println("2. Add Course");
		System.out.println("3. Drop Course");
		System.out.println("4. View Grades");
		System.out.println("5. Pay Fees");
		System.out.println("6. Change Password");
		System.out.println("7. Exit");
		
		
		StudentInterface studentObject = new StudentServiceOperations();
		
//		System.out.print("Enter your Choice:");
//		Scanner scan = new Scanner(System.in);
//		int studentChoice = scan.nextInt();
		
		
		
		int studentChoice=0;
		
		boolean flag;
		
		do
		{
			try {
				System.out.print("Enter your Choice: ");
				Scanner scan = new Scanner(System.in);
//				System.out.println("Enter Integer Value only");
				studentChoice = scan.nextInt();
				flag=false;
			}
			catch(Exception e)
			{
				System.out.println("======================================================");
				System.out.println("Please Select from above options only, try again");
				System.out.println("======================================================");
				flag = true;
			}
		}while(flag);
		
		switch(studentChoice) {
		
		case 1: 
//		System.out.println("\nCourse Registered");
		studentObject.registerCourses();
		displayStudentMenu();
		break;
	
		case 2: 
//			System.out.println("\nCourse Added");
		studentObject.addCourse();
		displayStudentMenu();
		break;
		
		case 3: 
//			System.out.println("\nCourse Dropped");
			studentObject.dropCourse();
		displayStudentMenu();
		break;
		
		case 4: 
//			System.out.println("\nGrades -->");
			studentObject.viewGradeCard();
		displayStudentMenu();
		break;
		
		case 5: 
//			System.out.println("\nFees Payment -->");
		studentObject.payFees();
		displayStudentMenu();
		break;
		
		case 6: 
//			System.out.println("\nPassword Change -->");
		studentObject.changePassword();
		displayStudentMenu();
		break;
		
		case 7: System.out.println("\nRedirecting to Main Menu ");
			CRSApplicationMenu exitobj= new CRSApplicationMenu();
		exitobj.main(null);
		break;
		
		default: System.out.println("Wrong Choice Selected, press ENTER to redirect to Student Menu.");
		try{System.in.read();}
		catch(Exception e) {}
		displayStudentMenu();
		}
		
//		scan.close();
	}

}
