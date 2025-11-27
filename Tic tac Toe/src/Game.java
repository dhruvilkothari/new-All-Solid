import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    Scanner sc;
    private Board board;
    private Deque<Player>players;

    public Game(int size){
        board = new Board(size);
        players = new LinkedList<>();
        sc = new Scanner(System.in);
    }

    public String startGame(){
        boolean isWinnerFound = false;
        while(isWinnerFound == false){
            Player p1 = players.pollFirst();
            board.printBoard();
            int r = sc.nextInt();
            int c = sc.nextInt();
            if(board.isStillGameOpen() == false)return "Tie";
            if(board.placePiece(r,c,p1.getPlayingPiece().getPieceType()) == false){
                players.addFirst(p1);
                continue;

            }
            if(board.isWinnerFound(r,c,p1.getPlayingPiece().getPieceType()) == true)return p1.getName();
        }
        return "Tie";
    }

}
