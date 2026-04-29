public class arraymax {
    void maxofarray(){
        int[] arr = {8, 6, 9, 4, 5,10};//ans =10
        int ans =0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>ans){
                ans = arr[i];
            }

    }
    System.out.println(ans);
}
    public static void main(String[] args) {
        arraymax obj = new arraymax();
        obj.maxofarray();
    
    }  
}
