/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.music.app;

/**
 *
 * @author divme
 */
public interface PlaylistOperations {
    void addSong(Song song);
    boolean deleteSong(Song song);
    
    void displayPlaylist();
    int getTotalNumberOfSongs();
}