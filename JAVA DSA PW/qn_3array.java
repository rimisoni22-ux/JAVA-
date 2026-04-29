public class qn_3array {
    static void isSorted(int[]arr){
        boolean check = true;
        for(int i=1;i<arr.length-1;i++){
            if (arr[i]<arr[i-1]){
                check = false;
                break;
            }
        }
        return check;

