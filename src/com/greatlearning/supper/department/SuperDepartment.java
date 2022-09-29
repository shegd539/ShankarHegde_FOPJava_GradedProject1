/**
 * 
 */
package com.greatlearning.supper.department;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Shankar Hegde
 *
 */
public class SuperDepartment {
	/*
	 * creating the constants for reusing purpose
	 */
	public final static String DEPARTMENTNAME = "Super Department";
	public final static String TODAYWORK = "No Work as of now";
	public final static String WORKDEADLINE = "Nil";
	public String CHECKHOLIDAY = "";

	public String departmentName() {

		return DEPARTMENTNAME;
	}

	public String getTodaysWork() {

		return TODAYWORK;
	}

	public String getWorkDeadline() {

		return WORKDEADLINE;
	}

	public String isTodayAHoliday() {

		Date todayDate = new Date();

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(todayDate);

		/*
		 * treated saturday or sunday is holiday
		 */

		if ((calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) || (Calendar.DAY_OF_WEEK == Calendar.SUNDAY)) {

			CHECKHOLIDAY = "Today is a Holiday";
			return CHECKHOLIDAY;
		} else {
			CHECKHOLIDAY = "Today is not a Holiday";

			return CHECKHOLIDAY;
		}

	}

}
