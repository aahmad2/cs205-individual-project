import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Album{
    private String albumName;
    private LocalDate releaseDate;
    private ArrayList<Song> catalogue;

    public Album(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ArrayList<Song> getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(ArrayList<Song> catalogue) {
        for (Song s:catalogue) {
            this.addSong(s);
        }
    }
    public void addSong(Song song){
        catalogue.add(song);
        song.setAlbum(this);
    }
}
