package Conditional_Loops;

import java.util.Scanner;

public class FindpowerofNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int p=1;
		for(int i=1;i<=x;i++) {
			p=p*n;
		}
		System.out.println(p);
	}
}
