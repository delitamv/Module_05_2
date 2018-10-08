package players;

import java.util.Arrays;

public class PlayerFour extends PlayerMain {
    private final int PRICE;

    PlayerFour(int price, String[] playList) {
        super(playList);
        this.PRICE = price;
    }

    public int getPRICE() {
        return PRICE;
    }
    @Override
    public void playSong() {
        System.out.println("Playing the last song: " + playList[playList.length - 1]);
    }

    @Override
    public void playAllSongs() {
        System.out.print("Playing all songs: ");
        for(int i = 0; i < playList.length; i++) {
            System.out.print(playList[i] + ", ");
        }
    }
}
