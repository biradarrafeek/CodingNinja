package Conditional_Loops;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i=2;
		while(i<=n/2) {
			if(n%i==0) {
				System.out.println(i+" ");
				i++;
			}
		}
	}
}
