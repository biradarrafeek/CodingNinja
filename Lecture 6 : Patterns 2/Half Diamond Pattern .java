import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();

        if(n==0) {
            System.out.println("*");
            System.out.println("*");
            return;
        }
        int i=1;
        while(i<=n+1) {
            int j=1,k=0;
            while(j<=2*i-1) {
                if(j==1||j==2*i-1){
                    System.out.print("*");
                }
                else {
                    if(j<=i)
                        System.out.print(++k);
                    else
                        System.out.print(--k);
                }
                j++;
            }
            i++;
            System.out.println();
        }
        i=n;
        int z=1;
        int y=0;
        while(i>=0) {
            int j=1,k=0;
            while(j<=2*n-(2*z)+1){
                if(j==1 || j==2*n-z-y)
                    System.out.print("*");
                else {
                    if(j<=(2*n-z-y)/2+1)
                        System.out.print(++k);
                    else
                        System.out.print(--k);
                }

                j++;
            }
            y++;
            i--;
            z++;
            System.out.println();
        }

    }
}
