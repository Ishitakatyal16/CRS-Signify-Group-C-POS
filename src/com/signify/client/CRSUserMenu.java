/**
 * 
 */

package com.signify.client;
import java.util.Scanner;
import com.signify.client.CRSStudentMenu;
import com.signify.service.UserInterface;
import com.signify.service.UserServiceOperations;
import com.signify.client.CRSAdminMenu;
import com.signify.client.CRSProfessorMenu;
/**
 * @author Acer
 *
 */
public class CRSUserMenu {
	
	
	public void displayUserMenu() {
		
		CRSStudentMenu ob1=new CRSStudentMenu();
		CRSAdminMenu ob2=new CRSAdminMenu();
		CRSProfessorMenu ob3=new CRSProfessorMenu();
		
		UserInterface userObject = new UserServiceOperations();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Username:  ");
		String userName = scan.nextLine();
		
		
		System.out.print("Enter Password:  ");
		String userPassword = scan.nextLine();
		
		int flag = 0;
		int userMenuFlag=0;
		
		do {
		System.out.print("Enter User Role\n"
				+"======================"+ "\n-Student : Press 1 "
				+ "\n-Professor : Press 2 "
				+ "\n-Admin : Press 3 " + "\n======================\n");
		System.out.print("\nEnter Your Choice: ");
		String userRole = scan.nextLine();
		
		
		if(userRole.equalsIgnoreCase("1"))
		{
			ob1.displayStudentMenu();
			flag = 2;
		}
		
		else if(userRole.equalsIgnoreCase("2"))
		{
			ob3.displayProfessorMenu();
			flag = 2;
		}
		
		else if(userRole.equalsIgnoreCase("3"))
		{
			ob2.displayAdminMenu();
			flag = 2;
		}
		
		else
		{
			flag=1;
			System.out.println("\n Please Enter Valid User Role\n\n");
		}
		}while(flag==1);
		
		scan.close();
		
	}

	
	
	
	

}
