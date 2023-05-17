import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i-1;j<n;j++)
            {
                System.out.print(j*2+1 +"");
            }
            for(int j=0;j<i-1;j++)
            {
                System.out.print(j*2+1 +"");

            }
            System.out.println();

        }
	}
}
