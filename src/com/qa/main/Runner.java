package com.qa.main;

public class Runner {
	//Subject Variables Person got for each subject
	static double Physics = 150;
	static double Biology = 150;
	static double Chemistry = 76;
	static double FullMarks = 150;
		
	//Method1
	public static void method1(String[] args) {
		System.out.println("Physics = " + Physics + " out of " + FullMarks);
	}
	public static void method2(String[] args) {
		System.out.println("Chemistry = " + Chemistry + " out of " + FullMarks);
	}
	public static void method3(String[] args) {
		System.out.println("Biology = " + Biology + " out of " + FullMarks);
	}		
	//Method2
	
	public static void method4(String[] args) {
		double TotalMarks = Biology + Chemistry + Physics;
		double TotalRatio = TotalMarks / (FullMarks * 3);
		double OverallPercentage = TotalRatio * 100;
		if (OverallPercentage >= 60 & Physics >= 75 & Chemistry >= 75 & Biology >= 75) {
			System.out.println("Overall Percentage = " + OverallPercentage + "%" + " Congratulations You Passed!!");
		}else {
			System.out.println("Overall Percentage = " + OverallPercentage + "%" + " Unfortunatly You Failed.");
		}
		
	}		
		
	//Display Method
	
	public static void main(String[] args) {
		method1(args);
		method2(args);
		method3(args);
		System.out.println("Total Mark = " + (Physics+Biology+Chemistry) + " out of " + (FullMarks * 3));
		method4(args);
	}	

}
