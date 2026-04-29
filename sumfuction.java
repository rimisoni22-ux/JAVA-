import java.util.*;
public class sumfuction {
    public static int calculatesum(int a,int b){//parameters or formal parameters
        int sum = a + b ;
        
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc .nextInt();
        int sum = calculatesum(a,b);
        System.out.println("sum is :"+sum);//actual/arguement opartors 
        
        calculatesum(a,b);

        
        
    }
    
}
