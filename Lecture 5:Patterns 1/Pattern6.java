package Patterns1;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				char ans=(char)('A'+j-1);
//				System.out.print(ans);
//			}
//			System.out.println();
//		}
		
		
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				char ans=(char)('A'+j-1);
				System.out.print(ans);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}
}
