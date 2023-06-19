class Solution {
    public void setZeroes(int[][] matrix) {
        int m= matrix.length;
        int n= matrix[0].length;
        int idx=0;
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(matrix[i][j]==0){
                    idx=0;
                    while(idx<m){
                        if(matrix[idx][j]!=0){
                        matrix[idx][j]=-1;
                        }
                        idx++;
                    }
                    idx=0;
                    while(idx<n){
                         if(matrix[i][idx]!=0){
                        matrix[i][idx]=-1;}
                        idx++;
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
    }
}}
