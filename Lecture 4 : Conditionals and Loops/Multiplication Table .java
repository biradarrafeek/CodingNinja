package Conditional_Loops;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=10;i++) {
			int ans=n*i;
			System.out.println(ans);
		}
	}
}
