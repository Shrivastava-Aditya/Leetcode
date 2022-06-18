class Solution {
    public static boolean isSafe(int row,int col,char[][] board){
        //horizontal
        for(int j=0;j<board.length;j++){
            if(board[row][j] == 'Q')
                return false;
        }
        //vertical
        for(int j=0;j<board.length;j++){
            if(board[j][col] == 'Q')
                return false;
        }
        //upperleft
        int r = row;
        for(int c=col;c>=0 && r>=0;r--,c--){
            if(board[r][c] == 'Q')
                return false;
        }
        //upper right
        r = row;
        for(int c=col;c<board.length && r>=0;r--,c++){
            if(board[r][c] == 'Q')
                return false;
        }
        
        //lowerleft
        r = row;
        for(int c=col;c>=0 && r < board.length; c--,r++){
            if(board[r][c] == 'Q')
                return false;
        }
        
        
        //lowerright
        r = row;
        for(int c=col;c<board.length && r < board.length;r++,c++){
            if(board[r][c] == 'Q')
                return false;
        }
        return true;
    }
    //to construct and save board
    public static void saveBoard(List<List<String>> allBoards,char[][] board){
        
        String row = "";
        List<String> newBoard = new ArrayList<>();
        
        for(int i=0;i<board.length;i++){
            row = "";
            for(int j=0;j<board[i].length;j++){
                if(board[i][j] == 'Q')
                    row+= 'Q';
                else row += '.';
            }
            newBoard.add(row);
        }
        
        allBoards.add(newBoard);
        
        
    }
    public static void helper(List<List<String>> allBoards,int col,char[][] board){
        if(col == board.length)
            saveBoard(allBoards,board);
        
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(allBoards,col+1,board);
                board[row][col] = '.';
                
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        
        helper(allBoards,0,board);
        
        return allBoards;
    }
}