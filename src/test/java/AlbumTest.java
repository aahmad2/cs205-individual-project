import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {

    @Test
    void getAlbumName() {
        Album temp = new Album("One X");
        assertEquals("One X", temp.getAlbumName());
    }

    @Test
    void setAlbumName() {
        Album temp = new Album("One X");
        temp.setAlbumName("New levels new devils");
        assertEquals("New levels new devils", temp.getAlbumName());


    }

    @Test
    void getReleaseDate() {
        Album temp = new Album("One X");
        LocalDate date = LocalDate.now();
        temp.setReleaseDate(date);
        assertEquals(date,temp.getReleaseDate());

    }

    @Test
    void setReleaseDate() {
        Album temp = new Album("One X");
        LocalDate date = LocalDate.now();
        temp.setReleaseDate(date);
        assertEquals(date,temp.getReleaseDate());
    }

    @Test
    void getCatalogue() {
        Album temp = new Album("One X");


    }

    @Test
    void addSong() {
        Album temp = new Album("One X");
        temp.addSong(new Song("Never too late"));
        assertEquals("Never too late", temp.getCatalogue().get(0).getSongName());
    }

    @Test
    void setCatalogue() {
        Album temp = new Album("One X");
        ArrayList<Song> list = new ArrayList();
        list.add(new Song("Never too late"));
        list.add(new Song("Pain"));
        temp.setCatalogue(list);
        assertEquals(list.get(1),temp.getCatalogue().get(1));
    }

}