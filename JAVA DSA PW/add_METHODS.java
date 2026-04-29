import java.util.*;
class Algebra {
    int add (int a, int b){

        int ans = a + b; 
         return ans;
    }
}
public class add_METHODS {
    public static void main(String[] args) {
         Algebra obj =new Algebra();
         Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int  b = sc.nextInt();
           System.out.print("The sum of  input  number is ");
          
          int ans = obj.add( a, b);
           System.out.print(ans); 
    }   
}
