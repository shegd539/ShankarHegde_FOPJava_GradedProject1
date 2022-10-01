package com.greatlearning.tech.department;

import com.greatlearning.supper.department.SuperDepartment;

/**
 * @author Shankar Hegde
 *
 */
public class TechDepartment extends SuperDepartment {

	/*
	 * creating the Tech department constants for reusing purpose
	 */

	public final static String DEPARTMENTNAME = "Tech Department";
	public final static String TODAYWORK = "Complete coding of module 1";
	public final static String WORKDEADLINE = "Complete by EOD";
	public final static String TECHSTACKINFO = "Core Java";

	public String departmentName() {

		return DEPARTMENTNAME;
	}

	public String getTodaysWork() {

		return TODAYWORK;
	}

	public String getWorkDeadline() {

		return WORKDEADLINE;
	}

	public String getTechStackInformation() {

		return TECHSTACKINFO;
	}
}
