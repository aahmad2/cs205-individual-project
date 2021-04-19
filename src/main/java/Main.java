import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to the program! Lets try making an artist, and add albums and songs in the albums!");
        System.out.println("Enter an artist name");
        Scanner keyboard = new Scanner(System.in);
        String userIn = keyboard.nextLine();
        Artist artist = new Artist(userIn);
        userIn = "";
        ArrayList<Album> albums = new ArrayList<>();
        ArrayList<Song> songs = new ArrayList<>();
        while (!userIn.equals("q")){
            System.out.println("Enter an album name for " + artist.getName() + " or enter q to exit");
            userIn = keyboard.next();
            if (!userIn.equals("q")){
                albums.add(new Album(userIn));
                while (!userIn.equals("q")){
                    System.out.println("Enter a song name for " + albums.get(albums.size()-1).getAlbumName() + "or enter q to exit");
                    userIn = keyboard.nextLine();
                    songs.add(new Song(userIn));
                    songs.get(songs.size()-1).setAlbum(albums.get(albums.size()-1));
                }
                userIn = "";
            }
        }
    }
}
