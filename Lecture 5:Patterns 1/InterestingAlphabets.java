package Patterns1;

import java.util.Scanner;

public class InterestingAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int num=n;
		for(int i=1;i<=n;i++) {
			int start='A'+num-1;
			for(int j=1;j<=i;j++) {
				System.out.print((char)(start));
				start++;
			}
			System.out.println();
			num--;
		}
	}
}
