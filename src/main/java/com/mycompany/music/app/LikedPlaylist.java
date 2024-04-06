/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.music.app;

/**
 *
 * @author divme
 */
public class LikedPlaylist extends Playlist {
    public LikedPlaylist() {
       
    }
    
   
    
    // Method to get the last song added to the playlist.
    public Song getLastAddedSong() {
        if (!songs.isEmpty()) {
            return songs.get(songs.size() - 1);
        }
        return null;
    }

    @Override
    public void displayPlaylist() {
        super.displayPlaylist(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void addSong(Song song) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteSong(Song song) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    @Override
    public int getTotalNumberOfSongs() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
