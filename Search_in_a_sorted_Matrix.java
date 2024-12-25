class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        for(int i =0; i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==x){
                    return true;
                }
            }
        }
        return false;
    }
}
