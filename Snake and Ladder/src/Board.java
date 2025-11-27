import java.util.LinkedList;
import java.util.List;

public class Board {

    private List<Jumper> snakes;
    private List<Jumper>ladders;
    private int size;

    public Board(int size){
        this.size = size;
        snakes = new LinkedList<>();
        ladders = new LinkedList<>();
        init();
    }
    public void init(){
        ///initialzie snakes ladders;
    }

    public void findNextPos(int count, Player player){

    }



}
