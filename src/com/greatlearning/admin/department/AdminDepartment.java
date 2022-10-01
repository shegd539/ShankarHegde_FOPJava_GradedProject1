/**
 * 
 */
package com.greatlearning.admin.department;

import com.greatlearning.supper.department.SuperDepartment;

/**
 * @author Shankar Hegde
 *
 */
public class AdminDepartment extends SuperDepartment {

	/*
	 * creating the admin department constants for reusing purpose
	 */

	public final static String DEPARTMENTNAME = "Admin Department";
	public final static String TODAYWORK = "Complete your documents submission";
	public final static String WORKDEADLINE = "Complete by EOD";

	public String departmentName() {

		return DEPARTMENTNAME;
	}

	public String getTodaysWork() {

		return TODAYWORK;
	}

	public String getWorkDeadline() {

		return WORKDEADLINE;
	}

}
