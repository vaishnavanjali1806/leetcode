class Solution {
    public void setZeroes(int[][] matrix) {
        boolean zeroinfirstcolm = false;
        int rows = matrix.length;
        int colms =matrix[0].length;

        for(int row = 0; row < rows; row++){
            if(matrix[row][0]==0){
                zeroinfirstcolm = true;
            }
            for(int colm = 1; colm < colms; colm++){
                if(matrix[row][colm]==0){
                    matrix[row][0]=0;
                    matrix[0][colm]=0;
                }
            }
        } 
        for(int row = rows-1; row >=0; row--){
            for(int colm= colms -1; colm >=1; colm--){
                if(matrix[row][0]==0 || matrix[0][colm]==0){
                    matrix[row][colm]=0;
                }
            }
            if(zeroinfirstcolm){
                matrix[row][0]=0;
            }
        }
    }
}
