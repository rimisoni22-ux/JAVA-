
import java.util.Scanner;

public class L_2evenoddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number ;
        int choice ;
        int evenSum=0;
        int oddSum=0;
        do { 
            System.out.println("Enter the number");
            number = sc.nextInt();
            if (number %2==0){
                evenSum+=number;
            }else{
                oddSum+=number;
            }
            System.out.println("do you want to continue press 1 for yes or o for no");
           choice = sc.nextInt(); 
        } while (choice==1);
        System.out.println("Sum of even number:"+evenSum);
        System.out.println("Sum of  odd number:"+oddSum);


        
    }

    
}
