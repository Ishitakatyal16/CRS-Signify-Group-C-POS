/**
 * 
 */
package com.signify.service;

/**
 * @author Dell
 *
 */
public class StudentServiceOperations implements StudentInterface {

	public void changePassword() {
		
		System.out.println("password changed");
	}
	
	public void register() {
		
		System.out.println("registered");
	}
	
    public void viewGradeCard() {
    	System.out.println("Grade card can be viewed");
    }
    
public void registerCourses() {
		
		System.out.println("course registered");
	}
	
	public void addCourse() {
			
			System.out.println("courses added");
		}
	public void dropCourse() {
			
			System.out.println("courses dropped");
		}
	public void payFees() {
			
			System.out.println("Fees paid");
		}
	
	public void viewRegisteredCourses() {
		
		System.out.println("courses viewed");
	}
	
	
}
