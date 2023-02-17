/**
 * 
 */
package com.signify.client;
import java.util.Scanner;
import java.lang.Thread;
import com.signify.client.CRSUserMenu;
import com.signify.client.CRSApplicationMenu;
import java.io.IOException;

/**
 * @author Dell
 *
 */
public class CRSApplicationMenu {
	
	public static void main(String[] args) {
		
		
		System.out.println("WELCOME TO THE CRS APPLICATION");
		System.out.println("========================================\n");
		System.out.println("MAIN MENU");
		System.out.println("1. Login");
		System.out.println("2. Registration for Student");
		System.out.println("3. Update Password");
		System.out.println("4. Exit\n");
		
		
		
//		Scanner scan = new Scanner(System.in);
		int userChoice=0;
		
		boolean flag;
		
		do
		{
			try {
				System.out.print("Enter your Choice: ");
				Scanner scan = new Scanner(System.in);
//				System.out.println("Enter Integer Value only");
				userChoice = scan.nextInt();
				flag=false;
			}
			catch(Exception e)
			{
				System.out.println("======================================================");
				System.out.println("Please Select from above options only, try again");
				System.out.println("======================================================");
				flag = true;
			}
		}
		
		while(flag);
		
		switch(userChoice) {
		
		case 1: System.out.println("\nLogin Here");
		System.out.println("============================");
		CRSUserMenu obj = new CRSUserMenu();
		obj.displayUserMenu();
		break;
		
		case 2: System.out.println("Registration");
		break;
		
		case 3: System.out.println("Password Update");
		break;
		
		case 4: CRSApplicationMenu exitobj= new CRSApplicationMenu();
		exitobj.main(null);
		break;
		
		default: System.out.println("Wrong Choice Selected, press ENTER to retry.");
		try{System.in.read();}
		catch(Exception e) {}
		main(null);
		}
		
//		scan.close();
	}

}
