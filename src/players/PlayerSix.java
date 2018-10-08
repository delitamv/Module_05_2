package players;

public class PlayerSix extends PlayerMain {
    private final int PRICE;

    PlayerSix(int price, String[] playList) {
        super(playList);
        this.PRICE = price;
    }
    public int getPRICE(){
        return PRICE;
    }

    @Override
    public void playSong() {
        System.out.println("Playing first song: " + playList[0]);
    }

    @Override
    public void playAllSongs() {
        super.playAllSongs();
    }

    public void shuffle(String[] playList) {
        String temp;
        int j = 0;
        for(int i = 0; i < playList.length; i++) {
            j = (int)(Math.random() * playList.length);
            if(i == j) continue;
            temp =  playList[i];
            playList[i] = playList[j];
            playList[j] = temp;
        }
    }
}
