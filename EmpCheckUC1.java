package com.bridgelabz.EmpWageBuilder_Day_8;

public class EmpCheckUC1 {
	public static void main(String[] args) {
		int is_full_time = 1;
		double empcheck = Math.floor(Math.random() * 10) % 2;
	if (empcheck == is_full_time)
		System.out.println("Employee is present");
		else
		System.out.println("Employee is absent");	
		
	}
}
