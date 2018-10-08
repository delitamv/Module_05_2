package players;

public class PlayerTwo extends PlayerMain {
    private final int PRICE;

    PlayerTwo(int price, String songOne) {
        super(songOne);
        this.PRICE = price;
    }

    public int getPRICE() {
        return PRICE;
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + songOne);
    }

}
