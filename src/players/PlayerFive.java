package players;

public class PlayerFive extends PlayerMain {
    private final int PRICE;

    PlayerFive(int price, String[] playList) {
        super(playList);
        this.PRICE = price;
    }

    public int getPRICE() {
        return PRICE;
    }
    @Override
    public void playSong() {
        System.out.println("Playing first song: " + playList[0]);
    }
    @Override
    public void playAllSongs() {
        System.out.print("Playing All Songs: ");
        for(int i = playList.length - 1; i >= 0; i--) {
            System.out.print(playList[i] + ", ");
        }
    }
}
