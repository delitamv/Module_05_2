package players;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PlayerOne playerOne = new PlayerOne(100, "In my Mind");
        System.out.println("Price player_1 = " + playerOne.getPRICE());
        playerOne.playSong();

        System.out.println();

        PlayerTwo playerTwo = new PlayerTwo(200, "Error");
        System.out.println("Price player_2 = " + playerTwo.getPRICE());
        playerTwo.playSong();

        System.out.println();

        String[] playList_3 = {"Shape of my heart",
                "Perfect", "Shape of You"};
        PlayerThree playerThree = new PlayerThree(300, playList_3);
        System.out.println("Price player_3 = " + playerThree.getPRICE());
        playerThree.playSong();
        playerThree.playAllSongs();
        System.out.println();

        System.out.println();

        String[] playList_4 = {"Don't Leave Me Alone",
                "Perfect", "Leave A Light On", "In My Feelings"};
        PlayerFour playerFour = new PlayerFour(400, playList_4);
        System.out.println("Price player_4 = " + playerFour.getPRICE());
        playerFour.playSong();
        playerFour.playAllSongs();
        System.out.println();

        System.out.println();

        String[] playList_5 = {"Wake Up", "The Sky",
                "Jackie Chan", "Better Now", "In My Feelings", "Z"};
        PlayerFive playerFive = new PlayerFive(500, playList_5);
        System.out.println("Price player_5 = " + playerFive.getPRICE());
        playerFive.playSong();
        playerFive.playAllSongs();

        System.out.println();
        System.out.println();

        String[] playList_6 = {"Promises",
            "Natural", "Solo", "I love it", "High Hopes", "A", "W"};
        PlayerSix playerSix = new PlayerSix(600, playList_6);
        System.out.println("Price Player_6 = " + playerSix.getPRICE());
        playerSix.playSong();
        playerSix.playAllSongs();
        System.out.println();
        playerSix.shuffle(playerSix.playList);
        System.out.println(Arrays.toString(playerSix.playList));
    }
}
