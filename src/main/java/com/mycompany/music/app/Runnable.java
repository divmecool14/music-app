/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.music.app;

/**
 *
 * @author divme
 */
abstract class Runnable extends Thread {
   // Concrete method to start playing the song
    void play() {
       
    }

    // Concrete method to pause the currently playing song
    void pause() {
        System.out.println("Pausing the currently playing song...");
    }

    // Concrete method to stop the song that is currently playing
    void stopSong() {
        System.out.println("Stopping the song that is currently playing...");
    }

    // Concrete method to move to the next song in the playlist
    void skip() {
        System.out.println("Moving to the next song in the playlist...");
    } 
}
