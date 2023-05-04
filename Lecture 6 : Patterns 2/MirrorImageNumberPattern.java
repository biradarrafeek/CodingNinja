
package Patterns1;
import java.util.Scanner;
public class MirrorImageNumberPattern {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// int i = 1;   
		// while( i<=n ){
		// 	int Start = 1;
		// 	int j =1;
		// 	while( j <= n - i ){
		// 		System.out.print(" ");
		// 		j++;
		// 	}
		// 	while(j<=n){
		// 		System.out.print(Start);
		// 		Start++;
		// 		j++;           }
		// 	System.out.println();
		// 	i++;
		// }	

		
		for(int i=1;i<=n;i++){
			int start=1;
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(start);
				start++;
			}
				System.out.println();
		}
	}
}
