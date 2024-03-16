/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.music.app.likedplaylist;

import com.mycompany.music.app.Song;
import java.util.ArrayList;

/**
 *
 * @author divme
 */
abstract class Playlist {
    //varibles
    private static ArrayList<Song> songs;
    
    //constructor
    public Playlist() {
        this.songs = new ArrayList<>();
    }
    
    //non abstract methods 
    public void add(ArrayList<Song> input){
        int position = (songs.size()-1);
        input.add(songs.get(position));
        songs.remove(position);
    };
    //will be called by only likedSong since protected
    protected void setSongs(ArrayList<Song> songs) {
            this.songs = songs;
    }
    
    //abstract methods 
    public abstract void search();
    public abstract void print();
    public abstract void delete();
    //public abstract void move();
    



/*maybe do it in thw way that agh liked can add to an arraylist and what */
}
