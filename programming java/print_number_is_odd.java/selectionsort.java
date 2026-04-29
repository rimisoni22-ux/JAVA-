
public class selectionsort{
    public static void selection_sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // turns
            int minpos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minpos] > arr[j]) {

                    minpos = j;

                }
            }
            //swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    } public static void insertion(int arr[]){
    for(int i = 1;i<arr.length;i++){
        int curr = arr[i];
        int prev = i -1;
        // finding input the correct pos to insert
        while(prev>=0&&arr[prev]>curr){
            arr[prev+1]=arr[prev];
            prev--;
        }
        // insertion 
        arr[prev+1]=curr;


    }
}

    
 public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
   

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
       // selection_sort(arr);
       insertion(arr);
        printArr(arr);

    }
}


