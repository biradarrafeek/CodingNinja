package Conditional_Loops;

import java.util.Scanner;

public class sumofEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int digit;
		int even=0;
		int odd=0;
		while(n!=0) {
			digit=n%10;
			n=n/10;
			if(digit%2==0) {
				even=even+digit;
			}
			else {
				odd=odd+digit;
			}
		}
		System.out.println(even+" "+odd);
	}
}
