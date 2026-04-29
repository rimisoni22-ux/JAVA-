import java.util.*;
public class refrencearray {
    static void printarray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
    }
    System.out.println();
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int []arr = new int[5];
        arr[0]= 7;
        arr[1]= 6;
        arr[2]= 8;
        arr[3]= 4;
        arr[4]= 9;              
        printarray(arr);    
        //trying to copy arr to arr_2
        // deep copy
       // int[] arr_2 = arr.clone();
       // shallow copy
        int[] arr_2 = Arrays.copyOf(arr,2);//print 76   
   // int[]arr_2 = Arrays.copyOfRange(arr, 1,4);//print 684

  
        System.out.println("copied arr_2");
        printarray(arr_2);
        //changing some values of 
        // arr_2[0]= 0;
        // arr_2[1]= 0;
        System.out.println("original array after changing arr_2 ");
        printarray(arr);
        System.out.println("copied arr_2 after canging arr_2");
        printarray(arr_2);
            
         } 
    
}

    