public class swapping {
    public static void main(String[] args) {
        int row = 2,col = 3;
        int matrix[][] ={{4,5,6},{8,9,3}};
        // display original matrix
            printmatrix(matrix);

            // transpose matrix
        int [][] transpose= new int[col][row];
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose [j][i]= matrix[i][j];

            }
        }
        // Print the transposed matrix
        printmatrix(transpose);

            }
            public static void printmatrix(int[][]matrix){
                System.out.println("the matrix is:");
                for(int i =0;i<matrix.length;i++){
                    for(int j =0;j<matrix[0].length;j++){
                        System.out.print(matrix[i][j]+" ");
                    }
                    System.out.println();
                }
            }
        }
        
 
