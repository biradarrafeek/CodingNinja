package Conditional_Loops;

import java.util.Scanner;

public class Total_Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int basic=scan.nextInt();
		char grade = scan.next().charAt(0);
		
		int allow =1300;
		double hra = (0.2d*basic);
		double da = (0.5d*basic);
		
		if(grade=='A') {
			allow=1700;
		}
		else if(grade=='B') {
			allow=1500;
		}
		double pf=(0.11d*basic);
		double totalSalary=basic+hra;
		totalSalary+=da;
		totalSalary+=allow;
		totalSalary-=pf;
		
		System.out.println(Math.round(totalSalary));
		
	}
}
