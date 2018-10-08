package players;

public class PlayerThree extends PlayerMain{
    private final int PRICE;

    PlayerThree(int price, String[] playList) {
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
    System.out.print("Playing all songs: ");
        for(String temp : playList) {
            System.out.print(temp + ", ");
        }
    }

}
