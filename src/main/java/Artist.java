import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Album> discography;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Album> getDiscography() {
        return discography;
    }

    public void setDiscography(ArrayList<Album> discography) {
        this.discography = discography;
    }

    public void addAlbum(Album album){
        discography.add(album);
    }
}
