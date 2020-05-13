public class RediStreamingService {

    public static void main(String... args) {
        Player player = new Player();
        User user = new User("Yana");
        User user2 = new User("Dima");
        Artist queen = new Artist("Queen");
        Track track = new Track(1, "Don't Stop Me Now", queen, "Jazz");
        Track track1 = new Track(2, "With a little help", new Artist("The Beatles"), "Sgt. Peppers' Lonely Hearts Club Band");
        Track track2 = new Track(3, "People Are Strange", new Artist("The Doors"), "Strange Days");
        Track track3 = new Track(4, "Stressed Out", new Artist("21 Pilots"), "Blurryface");

        player.play(track, user);
        player.play(track1, user);
        player.play(track2, user2);
        player.play(track3, user);
        player.play(track, user2);
        player.play(track, user2);
        player.play(track1, user2);
        player.play(track2, user2);
        player.play(track3, user2);
        player.play(track3, user2);
        player.play(track, user);
        player.play(track3, user);
        player.play(track, user);
        player.play(track3, user);

        player.getTopFanForArtist(queen);
    }
}
