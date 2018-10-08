package players;

public class PlayerOne extends PlayerMain{
    private final int PRICE;

    PlayerOne(int price, String songOne) {
        super(songOne);
        this.PRICE = price;
    }
    int getPRICE() {
        return PRICE;
    }
    @Override
    public void playSong() {
        System.out.println("Playing: " + songOne);
    }
}
