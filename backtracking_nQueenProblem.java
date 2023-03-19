public class main{
 public static boolean issafe(int row, int col, char[][] board) {
        //horizontal and vertical
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        int c = col;
        //upper left
        for (int r = row; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        c = col;
        //lower left
        for (int r = row; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        c = col;
        //upper right
        for (int r = row; r > 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        //lower right
        c = col;
        for (int r = row; r < board.length && c < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static List<List<String>> saveBoard(List<List<String>> allBoards, char[][] board){
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for(int i=0;i< board.length;i++){
            row = "";
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]=='Q'){
                    row += 'Q';
                }
                else{
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
        return allBoards;
    }

    public static void nqueen(List<List<String>> allBoards, char[][] board, int col){
        if(col==board.length){
            saveBoard(allBoards,board);
            return;
        }

        for(int row=0;row<board.length;row++){
            if(issafe(row,col,board)){
                board[row][col]='Q';
                nqueen(allBoards, board, col+1);  // recursion
                board[row][col]='.';  //backtracking
            }
        }

    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        nqueen(allBoards,board,0);
        System.out.println(allBoards);

    }
}
