/**
 * 
 */
package com.signify.bean;
import java.util.*;

/**
 * @author Dell
 *
 */
public class Professor extends User {

	private String department;
	private String designation;
	private Date DOJ;
	

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getDOJ() {
		return DOJ;
	}
	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}
		
	
}
