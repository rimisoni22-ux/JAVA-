import java.util.*;
public class streamofinteger {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        int num = Sc.nextInt();
         int sum =0;
         while(num!=-1){
            sum+=num;
            num = Sc.nextInt();
         }
         System.out.println(sum);

        
        
    }
    
}
