import java.sql.Time;
import java.util.Date;

public class Song {
    private String songName;
    private Date releaseDate;
    private Time runTime;
    private String genre;


    public Song(String songName) {
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Time getRunTime() {
        return runTime;
    }

    public void setRunTime(Time runTime) {
        this.runTime = runTime;
    }
}
