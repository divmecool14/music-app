/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.music.app;

import java.util.ArrayList;

/**
 *
 * @author divme
 */
public class LikedPlaylist extends Playlist {

    @Override
    public void move() {
        super.move(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void displayPlaylist() {
        super.displayPlaylist(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
     private ArrayList<Song> songs;
    public LikedPlaylist() {
       songs = new ArrayList<>();
    }
    
   
    
    // Method to get the last song added to the playlist.
    public Song getLastAddedSong() {
        if (!songs.isEmpty()) {
            return songs.get(songs.size() - 1);
        }
        return null;
    }
    public void deleteLastAddedSong(){
        if (!songs.isEmpty()) {
             songs.remove(songs.size() - 1);
        }
    };

    
    public String getPlaylistnames() {//for displaying purposes 
        ArrayList<String> nameOfsongs = new ArrayList<String>();
        for(int i = 0; i<songs.size();i++){
            nameOfsongs.add(songs.get(i).getTitle());
        }
        String paragraph = "";
        for (int i = 0; i < nameOfsongs.size(); i++) {
            paragraph += nameOfsongs.get(i);
            if (i < nameOfsongs.size() - 1) {
                paragraph += ", ";
            }
        }
        return paragraph;
    }

    @Override
    public void addSong(Song song) {
        songs.add(song);
    }

    
    public  void deleteSongAfterMove() {
       songs.remove(songs.size()-1);
       
    }
    public String deleteSongByTitle(String titleToDelete) {
        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
            if (song.getTitle().equals(titleToDelete)) {
                songs.remove(i);
                return "Song '" + titleToDelete + "' was deleted.";
            }
        }
        return "There was nothing that matched.";
    }
    

   

    @Override
    public int getTotalNumberOfSongs() {
       return songs.size();
    }

    @Override
    public boolean deleteSong(Song song) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void empty(){
        songs.clear();
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
    
    
    
    
}
