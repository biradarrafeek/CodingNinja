package Loops;

import java.util.Scanner;

public class FahrenheitToCelsiusTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int S=scan.nextInt();
		int E=scan.nextInt();
		int W=scan.nextInt();
		int fahr;

		while(S<=E) {
			fahr=((5*(S-32))/9);
			System.out.println(S+" "+fahr);
			S=S+W;
		}
	}
}
