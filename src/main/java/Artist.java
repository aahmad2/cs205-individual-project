import java.util.Optional;

public class Artist {
    private String name;
    private Album[] discography;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Album[] getDiscography() {
        return discography;
    }

    public void setDiscography(Album[] discography) {
        this.discography = discography;
    }

    public void addAlbum(Album album){
        discography[discography.length]=album;
    }
}
