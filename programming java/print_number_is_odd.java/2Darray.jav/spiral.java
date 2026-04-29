public class spiral {
    // public static void printspiral(int matrix[][]){
 
    //     int sr = 0;
    //     int er = matrix.length - 1;
    //     int sc = 0;
    //     int ec = matrix[0].length - 1;
    //     while (sr <= er && sc <= ec) {
    //         // top
    //         for (int j = sc; j <= ec; j++) {
    //             System.out.print(matrix[sr][j] + " ");
    //         }

    //         // right
    //         for (int i = sr + 1; i <= er; i++) {
    //             System.out.print(matrix[i][ec] + " ");
    //         }

    //         // bottom
            
    //             for (int j = ec - 1; j >= sc; j--) {
    //                 if(sr==er){
    //                     break;

    //                 }
    //                 System.out.print(matrix[er][j] + " ");
                
    //         }

    //         // left
        
    //             for (int i = er - 1; i > sr; i--) {
    //                 if(sc==ec){
    //                     break;
    //                 }
    //                 System.out.print(matrix[i][sc] + " ");
    //             }
    //         sr++;
    //         sc++;
    //         er--;
    //         ec--;
    //     }
    //        System.out.println();
    //     }
        public static int  diagonalsum(int matrix[][]){
            // int sum =0;
            // for(int i =0;i<matrix.length;i++){
            //     for(int j =0;j<matrix[0].length;j++){
            //         // primary
            //         if(i==j){
            //             sum+=matrix[i][j];
            //         }
            //         else if(i+j==matrix.length-1){
            //             sum+=matrix[i][j];

            //         } 
            //     }
            //     }
            //     return sum;
               int sum = 0;
               for(int i =0;i<matrix.length;i++){
                //pd
                sum+= matrix[i][i];
                // sd 
                if(i!=matrix.length-i-1)
                sum+=matrix[i] [matrix.length-i-1];
               }
               return sum;   

        }
    public static void main(String[] args) {
        int  matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // printspiral(matrix);
        diagonalsum(matrix);

        
    }
    
}
