public class Dice {
    int count ;
    private Dice instance;
    private Dice(int count){
        this.count = count;
    }
    public  Dice getInstance(int count){
        if(instance==null){
            instance = new Dice(count);
        }return instance;
    }
}
