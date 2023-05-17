import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=i;k++)
            {	
                if(k==i)
                    System.out.print(k);
                else
                    System.out.print(k+ "+");         			       
            }
            for(int j=1;j<=1;j++)
            {
                System.out.print("=");
            }

            sum=sum+i;
            System.out.println(sum);
        }
    }
}
