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

public abstract class Playlist implements PlaylistOperations {
    protected List<Song> songs;
    protected String name;

    public Playlist() {
       
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public boolean deleteSong(Song song) {
        return songs.remove(song);
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

    
}
