class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
 

       int num=matrix[0][0];
        for(int i=0;i<=matrix.length-2;i++){
            for(int j=0;j<=matrix[i].length-2;j++){
                if(matrix[i][j]!=matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
        
    }
}