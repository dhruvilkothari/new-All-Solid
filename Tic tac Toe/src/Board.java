public class Board {
    private int size;
    private PieceType[][] board;

    public Board(int size){
        this.size = size;
        board = new PieceType[size][size];
    }
    public boolean placePiece(int row,int col, PieceType pieceType){
        if(row<0 || col <0 || row>=size || col>=size || board[row][col]!=null)return false;
        board[row][col] = pieceType;
        return true;
    }
    public boolean isStillGameOpen(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null)return true;
            }
        }
        return false;
    }
    public void printBoard(){

    }

    public boolean isWinnerFound(int row,int col, PieceType pieceType){
        boolean down = true;
        boolean right = true;
        boolean diognal = true;
        boolean antidiognal = true;

        for(int i=0;i<size;i++){
            if (board[i][col]!=pieceType){
                down = false;
                break;
            }
        }




        return down||right||diognal||antidiognal;

    }
}
