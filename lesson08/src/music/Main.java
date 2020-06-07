package music;

import music.Album;

public class Main {
    public static void main(String[] args) {
        music.Artist samSmith = new music.Artist();
        samSmith.artistName = "Sam Smith";
        samSmith.labelName = "Capitol Records";

        Album itlh = new Album("In The Lonely Hour", samSmith, 2014);
        Album itlhe = new Album("In The Lonely Hour - DSE", samSmith, 2015);
    }
}
