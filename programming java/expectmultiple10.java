
import java.util.Scanner;

public class expectmultiple10 {
    public static void main(String[] args) {
         Scanner Sc = new Scanner(System.in);
         do {
            System.out.println("Enter your number:");
            int n =Sc.nextInt();
            if (n%10==0){
                continue;
            }
            System.out.println("number was :"+n);

         }while (true);
        
    } 
    
}
