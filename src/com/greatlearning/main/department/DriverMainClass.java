package com.greatlearning.main.department;

import com.greatlearning.admin.department.AdminDepartment;
import com.greatlearning.hr.department.HrDepartment;
import com.greatlearning.tech.department.TechDepartment;

public class DriverMainClass {

	public final static String WELCOMEMSG = " Welcome to ";
	
	public static void main(String[] args) {

		/*
		 * To Display Admin Department
		 */
		String adminDepartmentName="",adminTodaysWork="",adminWorkDeadline="",adminTodayAHoliday="";
		AdminDepartment adminDepartment = new AdminDepartment();
		
		adminDepartmentName=adminDepartment.departmentName();
		adminTodaysWork=adminDepartment.getTodaysWork();
		adminWorkDeadline=adminDepartment.getWorkDeadline();
		adminTodayAHoliday=adminDepartment.isTodayAHoliday();
		System.out.println(WELCOMEMSG+adminDepartmentName+"\n"+adminTodaysWork+"\n"+adminWorkDeadline+"\n"+adminTodayAHoliday);
		System.out.println("");
		System.out.println("");

		/*
		 * To Display HR Department
		 */
		
		String hrDepartmentName="",hrActivity="",hrTodaysWork="",hrWorkDeadline="",hrTodayAHoliday="";
		HrDepartment hrDepartment = new HrDepartment();
		hrDepartmentName=hrDepartment.departmentName();
		hrActivity=hrDepartment.doActivity();
		hrTodaysWork=hrDepartment.getTodaysWork();
		hrWorkDeadline=hrDepartment.getWorkDeadline();
		hrTodayAHoliday=hrDepartment.isTodayAHoliday();
		System.out.println(WELCOMEMSG+hrDepartmentName+"\n"+hrActivity+"\n"+hrTodaysWork+"\n"+hrWorkDeadline+"\n"+hrTodayAHoliday);
		System.out.println("");
		System.out.println("");

		/*
		 * To Display Tech Department
		 */

		TechDepartment techDepartment = new TechDepartment();
		String techDepartmentName="",techTodaysWork="",techWorkDeadline="",techTodayAHoliday="",techStackInformation="";
		techDepartmentName=techDepartment.departmentName();
		techTodaysWork=techDepartment.getTodaysWork();
		techWorkDeadline=techDepartment.getWorkDeadline();
		techStackInformation=techDepartment.getTechStackInformation();
		techTodayAHoliday=techDepartment.isTodayAHoliday();
		System.out.println(WELCOMEMSG+techDepartmentName+"\n"+techTodaysWork+"\n"+techWorkDeadline+"\n"+techStackInformation+"\n"+techTodayAHoliday);

	}

}
