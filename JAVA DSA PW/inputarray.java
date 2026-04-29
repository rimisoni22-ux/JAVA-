import java.util.*;
public class inputarray {
    public static void main(String[] args) {
        
        

    
        Scanner sc = new Scanner(System.in);
         System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        
        System.out.println( "enter array " + n + "elements");
        for (int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

       
        //trying to copy arr to arr_2
        int[] arr_2 = arr;
        for(int i =0; i<n;i++){

        
        System.out.print(arr_2[i]+ " ");
    }
            
        }
    }
