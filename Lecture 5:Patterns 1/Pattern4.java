package Patterns1;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int p=1;
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(p);
				p++;
				j++;
			}
			System.out.println();
			i++;
		}
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(p);
//				p=p+1;
//			}
//			System.out.println();
//		}
	}
}
