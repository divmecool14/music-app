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
public class GenrePlaylist extends Playlist {

    @Override
    public boolean deleteSong(Song song) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    private ArrayList<Song> songs;
    
    public void addSong(Song song) {
        songs.add(song);
    }
    public  void deleteSongAfterMove() {
       songs.remove(songs.size()-1);
       
    }
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
      public void empty(){
        songs.clear();
    }

    
 


    @Override
    public int getTotalNumberOfSongs() {
       return songs.size();
    }
    

    public GenrePlaylist() {
        songs = new ArrayList<>();
        
    }


    
    public Song move(String titleToFind) {
        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
            if (song.getTitle().equals(titleToFind)) {
                songs.remove(i); // remove the song from the playlist
                return song; // return the removed song object
            }
        }
        return null; // return null if no match is foudn
    }

    @Override
    public void displayPlaylist() {
        super.displayPlaylist(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    
    

   
    
    
}
