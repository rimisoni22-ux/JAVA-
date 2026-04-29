import java.util.Scanner;
public class pairSum {
    static int pair_Sum(int [] arr,int target){
        int n = arr.length;
        int ans =0;
        for ( int i =0;i<n;i++){//first number
            for(int j =i+1;j<n;j++){//second number
                for ( int k = j+1;k<n;k++){//third number
                if (arr [i] + arr[j] + arr[k] == target){ //check if sum is equal to target
                    ans++;
                }
            }
            
        }
    }
        return ans ;
    
}

 public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter array size");
    int n = sc.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter"+ n + "elements");
    for(int i =0; i<n;i++){
        arr[i]=sc.nextInt();
    }
        System.out.println("enter target sum");
        int target = sc.nextInt();
        System.out.println(pair_Sum (arr,target));
    

}
         
    
 }
