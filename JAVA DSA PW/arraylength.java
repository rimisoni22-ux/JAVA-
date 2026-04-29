public class arraylength {
    void demo2(){
        int [][] arr ={{12,34,56},{12,45,67}};
         for (int i =0;i<arr.length;i++){
            //arr[0]andarr[1]
            for (int j =0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
         }
       
        } 
    }
    public static void main(String[] args) {
        arraylength obj = new arraylength();
        obj.demo2();
        
    }
    
}
