package Patterns1;

import java.util.Scanner;

public class ReverseNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
//		int rn=1;
//		int i=1;
//		while(i<=n) {
//			int j=1;
//			rn=i;
//			while(j<=i) {
//				System.out.print(rn);
//				j=j+1;
//				rn=rn-1;
//			}
//			i=i+1;
//			System.out.println();
//		}
		
		int rn=1;
		for(int i=1;i<=n;i++) {
			rn=i;
			for(int j=1;j<=i;j++) {
				System.out.print(rn);
				rn=rn-1;
			}
			System.out.println();
		}
	}
}
