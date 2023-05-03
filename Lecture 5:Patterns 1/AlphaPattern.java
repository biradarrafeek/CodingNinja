package Patterns1;

import java.util.Scanner;

public class AlphaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();

		int i=1;
		int ap=65;
		while(i<=n) {
			
			int j=1;
			while(j<=i) {
				System.out.print((char)ap);
				j=j+1;
			}
			ap=ap+1;
			i=i+1;
			System.out.println();

		}
//		
//		int ap=65;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print((char)ap);
//			}
//			ap=ap+1;
//			System.out.println();
//		}
	}
}
