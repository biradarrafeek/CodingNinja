import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      for(int i=1;i<=n;i++)
	      {	
	          int ch=i;
	          for(int j=1;j<=n-i;j++)
	          {
	              System.out.print(" ");
	          }
	          for(int k=1;k<=i;k++)
	          {
	              System.out.print(ch);
	              ch=ch+1;
	          }
	          for(int dec=(2*i-2);dec>=i;dec--)
	          {
	                System.out.print(dec);
	          }
	          System.out.println();
	      }
	}
}
