import java.util.*;
public class countDIGIT {
    // count the number of digits for a given number n
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n= Sc.nextInt();
        int numOFDigits = 0;
        int original_n = n;
        while (n>0){
            n=n/10;
            numOFDigits++;
        }
        System.out.println("Number of dogits in "  + original_n + " = "+numOFDigits);
        
    }
    
}
