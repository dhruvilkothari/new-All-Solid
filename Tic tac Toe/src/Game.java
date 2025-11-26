import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board;
    private Deque<Player>players;

    public Game(int size){
        board = new Board(size);
        players = new LinkedList<>();
    }

    public String startGame(){
        boolean isWinnerFound = false;
    }

}
