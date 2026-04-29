import java.util.*;
public class arraymx {
    static int findmax(int[] arr){
        int mx =Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if (arr[i]>mx){
                mx =arr[i];
            }
        }
        return mx;
    }
    

    
}
