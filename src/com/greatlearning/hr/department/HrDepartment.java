package com.greatlearning.hr.department;

import com.greatlearning.supper.department.SuperDepartment;

/**
 * @author Shankar Hegde
 *
 */
public class HrDepartment extends SuperDepartment {

	/*
	 * creating the HR department constants for reusing purpose
	 */

	public final static String DEPARTMENTNAME = "HR Department";
	public final static String TODAYWORK = "Fill today’s timesheet and mark your attendance";
	public final static String WORKDEADLINE = "Complete by EOD";
	public final static String ACTIVITY = "team Lunch";

	public String departmentName() {

		return DEPARTMENTNAME;
	}

	public String getTodaysWork() {

		return TODAYWORK;
	}

	public String getWorkDeadline() {

		return WORKDEADLINE;
	}

	public String doActivity() {

		return ACTIVITY;
	}

}
