import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n<3){
            System.out.print(true);
        }
        else{
            int prev = s.nextInt();
            int cur = s.nextInt();

            int flag =0;
            int diff = cur - prev;

            for(int i =1;i<n-1;i++){
                if(cur - prev!=diff){
                    System.out.print(false);
                    flag++;
                    break;
                }
                else{
                    prev = cur;
                    cur = s.nextInt();
                }
            }
            if(flag ==0){
                System.out.print(true);
            }
        }
    }
}
