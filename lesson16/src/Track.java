public class Track {
    private int id;
    private String name;
    private Artist artist;
    private String albumName;

    public Track(int id, String name, Artist artist, String albumName) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.albumName = albumName;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
