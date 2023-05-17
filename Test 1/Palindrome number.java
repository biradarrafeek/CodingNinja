import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Write your code here
        Scanner s =new Scanner (System.in);
        int n=s.nextInt();
        int rev=0;
        int i=n;
        
        
        while(i>0) {
            int rem =i%10;
            int que= i/10;
            rev=rev*10+rem;
            i=que;

        }
        if(rev==n) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
