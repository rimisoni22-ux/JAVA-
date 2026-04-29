public class arrayrefrence {
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
    }
    System.out.println();
    
}
static void changeArray(int[]arr){
    for(int i=0;i<arr.length;i++){
        arr[0]=9;
        
    }

}

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        printArray(arr);
        changeArray(arr);
        printArray(arr);
    }
}
