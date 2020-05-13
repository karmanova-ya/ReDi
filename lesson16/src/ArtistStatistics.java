import java.util.HashMap;
import java.util.Map;

public class ArtistStatistics {
    Map<User, Integer> trackPlays = new HashMap<>();

    @Override
    public String toString() {
        return "ArtistStatistics{" +
                "trackPlays=" + trackPlays +
                '}';
    }

    //How many different users have streamed my music?
    public void recordPlay(User user) {
        if (trackPlays.containsKey(user)) {
            int totalStreams = this.trackPlays.get(user) + 1;
            this.trackPlays.put(user, totalStreams);
        } else {
            trackPlays.put(user, 1);
        }
    }

    //Who is my top fan? (Most played tracks)
    public User getTopFan() {
        int max = 0;
        User topFan = null;
        for (Map.Entry<User, Integer> entry : trackPlays.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                topFan = entry.getKey();
            }
        }
        return topFan;
    }

    public int getDifferentUserCount() {
        return trackPlays.keySet().size();
    }
}
