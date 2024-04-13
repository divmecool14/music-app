/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.music.app;

/**
 *
 * @author divme
 */
public class MusicApp {

    public static void main(String[] args) {
        Home home = new Home();
        home.setVisible(true);
        LikedPlaylist l = new LikedPlaylist(home);
        GenrePlaylist g = new GenrePlaylist(home);
        
        
    }
}
