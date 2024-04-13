/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.music.app;




/**
 *
 * @author divme
 */
import java.util.ArrayList;
import java.util.List;

public abstract class Playlist extends Runnable implements PlaylistOperations  {
    protected List<Song> songs;
    protected String name;

    public Playlist() {
       
    }

    public void addSong(Song song) {
        songs.add(song);
    }

   

    public void displayPlaylist() {
        System.out.println("Playlist: " + name);
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    
    ///impliment soon
    public  void move(){};

    public int getTotalNumberOfSongs() {
        return songs.size();
    }

      public static String searchSongDetailsByTitle(String titleToFind, ArrayList<Song> songs) {
        StringBuilder details = new StringBuilder();
        
        for (Song song : songs) {
            if (song.getTitle().equals(titleToFind)) {
                // If the title matches, append details of the song to the result string
                details.append("Title: ").append(song.getTitle()).append("\n");
                details.append("Artist: ").append(song.getArtist()).append("\n");
                details.append("Album: ").append(song.getAlbum()).append("\n");
                // Add more details as needed, e.g., length, composer, etc.
                return details.toString();
            }
        }
        return "Song with title '" + titleToFind + "' not found.";
    }    
}
