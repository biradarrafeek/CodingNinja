package Conditional_Loops;

import java.util.Scanner;

public class FindCharacter_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		char ans=scan.next().charAt(0);
		
		if(ans>='A' && ans<='Z') {
			System.out.println("1");
		}
		else if(ans>='a' && ans<='z') {
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}
	}
}
