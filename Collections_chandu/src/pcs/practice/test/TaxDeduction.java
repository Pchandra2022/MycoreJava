package pcs.practice.test;

import java.util.Scanner;

public class TaxDeduction {

	static String empName = "chandu";
	static long empSalary = 630000;
	static int taxPercentage = 10;
//	static long salaryDetection;
	static long finalSal;

	public static void taxDeduction(String empNm, int rangeFrom, int rangeTo) {
		// here i will writing method for findByempname method for getting perticular
		// employee from the db
		if (empNm.equals(empName)) {
			// 1-->after getting the employee next that perticular employee salary getting
			// by findSalarybyEmpName
			// 2-->afte getting salary caluculating range between from&&to ranges
			if (rangeFrom < empSalary && empSalary < rangeTo) {
//				salaryDetection = ((empSalary/100)*taxPercentage);
//				finalSal = empSalary-salaryDetection;
				finalSal = ((empSalary / 100) * (100 - taxPercentage));
			} else {
				// if it is come than i will rasing the exception with name EmpNotFound
				System.out.println("employee salary is not in range");
			}
		} else {
			// if it is also come than i will rasing the exception with EmpSalaryNotInRange
			System.out.println("employee not found");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter emp name :");
		String ename = sc.nextLine();
		System.out.print("please enter salary fromrange :");
		int salFromRange = sc.nextInt();
		System.out.print("please enter salary torange :");
		int salToRange = sc.nextInt();
		System.out.println("primarily empsalary : " + empSalary);
		TaxDeduction.taxDeduction(ename, salFromRange, salToRange);
		System.out.println("final empsalary : " + finalSal);

	}

}
