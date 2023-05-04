package Patterns1;

import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
//
//		int i=1;
//		while(i<=n) {
//			char p=(char)('A'+i-1);
//			int j=1;
//			while(j<=n) {
//				System.out.print(p);
//				p=(char)(p+1);
//				j=j+1;
//			}
//			System.out.println();
//			i=i+1;
//		}
		
		for(int i=1;i<=n;i++) {
			char p= (char)('A'+i-1);
			for(int j=1;j<=i;j++) {
				System.out.print(p);
				p=(char)(p+1);
			}
			System.out.println();
		}
	}
}
