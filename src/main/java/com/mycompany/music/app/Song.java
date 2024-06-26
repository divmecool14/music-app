/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.music.app;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author divme
 */
public class Song implements media {
    private String title;
    private String artist;
    private String album;
    private int length;

    public Song(String title, String artist, String album,int length) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.length = length;
    }

    // Implementing methods from the Media interface
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getArtist() {
        return artist;
    }

    @Override
    public String getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " [" + album + "]";
    }

    @Override
    public int getLength() {
       return length;  
    }
    
}
