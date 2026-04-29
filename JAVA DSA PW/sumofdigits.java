import java.util.*;
public class sumofdigits {
    public static void main(String[] args) {
         Scanner Sc =new Scanner(System.in);
         int n = Sc. nextInt();
         int sumofdigits = 0;
         int original_n =n;

          while(n>0){
            sumofdigits +=n%10;
            n =n /10;
        

          }
          System.out.println(" sum of digits "+ original_n+"="+sumofdigits);
        
    }

    
}
