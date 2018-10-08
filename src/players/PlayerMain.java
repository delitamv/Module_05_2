package players;

public class PlayerMain {
    String songOne;
    String[] playList/* = new String[] {"Promises",
            "Natural", "Solo", "I love it", "High Hopes"}*/;

    PlayerMain(String songOne) {
        this.songOne = songOne;
    }
    PlayerMain(String[] playList) {
        this.playList = playList;
    }

    PlayerMain(){}

    public void playSong() {
        System.out.println("Playing: " + songOne);
    }
    public void playAllSongs() {
        System.out.print("Playing All Songs: ");
        for(String temp : playList) {
            System.out.print(temp + ", ");
        }
    }
}
