import java.util.*;
public class series {
    //find  the sum of series [1-2+3-4+5...]  
    public static void main(String[] args) {
        Scanner SC =new Scanner(System.in);
        int n = SC.nextInt();
        int ans=0;
         for (int i=1; i<=n;i++){
            if (i%2==0){
                ans-=i;
                
            }else{
                ans+=i;
            }

         } System.out.println(ans);


        
    }
    
}
