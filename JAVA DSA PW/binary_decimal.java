 import java.util.*;
public class binary_decimal {
     public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
            int binary_num= sc.nextInt();
             int ans = 0;//converted decimal number
             int pw = 1; // 2^0 = 1; power of 2
              while ( binary_num>0){
               int unit_digit=binary_num%10;
                ans +=(unit_digit*pw);
                binary_num/=10;
                 pw *=2;
              }
              System.out.println(ans);
              //explanation is in the video, watch it for better understanding
              // 1. take the unit digit of the binary number
                 // 2. multiply the unit digit with the power of 2 and add it to the answer
                     // 3. divide the binary number by 10 to remove the unit digit
                         // 4. multiply the power of 2 by 2 to get the next power of 2
                             // 5. repeat the process until the binary number becomes 0
                             

         
     }
    
}
