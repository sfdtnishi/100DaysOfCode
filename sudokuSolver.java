//using backtracking

public class sudokuSolver {
    public boolean isSafe(char[][] board, int row, int col, int num){
        for(int i=0;i<board.length;i++){
            if(board[i][col]==(char)(num+'0')){
                return false;
            }
            if(board[row][i]==(char)(num+'0')){
                return false;
            }
        }

        int srow = (row/3)*3;
        int scol = (col/3)*3;
        for (int i=srow;i<srow+3;i++){
            for(int j=scol;j<scol+3;j++){
                if(board[i][j]==(char)(num+'0')){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean helper(char[][] board, int row, int col){
        if(row == board.length){
            return true;
        }

        int nrow = 0;
        int ncol = 0;
        if(col==board.length-1){
            nrow = row+1;
            ncol =0;
        }
        else{
            nrow = row;
            ncol =col+1;
        }

        if(board[row][col]!='.'){
            if(helper(board, nrow, ncol)){
                return true;
            }
        }
        else{
            for(int i=1;i<=9;i++){
                if(isSafe(board, row, col, i)){
                    board[row][col]=(char)(i+'0');
                    if(helper(board,nrow, ncol))
                        return true;

                    else
                        board[row][col]='.';

                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        helper(board, 0,0);
    }
   

}
