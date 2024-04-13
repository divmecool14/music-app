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
abstract class Runnable extends Thread {
   // Concrete method to start playing the song
     int seconds;
    static Home home;
     int positionInArrayList = 0;
    private  ArrayList<Song> List = new ArrayList<>();
    private static boolean pause = false;
    
     public static void setHome(Home home) {
        Runnable.home = home;
    }

    public  void setList(ArrayList<Song> List) {
        this.List = List;
        seconds = 0;
        positionInArrayList = 0;
    }
    
    

    public  int getSeconds() {
        return seconds;
    }

    

    public static void setPause(boolean pause) {
        Runnable.pause = pause;
    }
    
    
    
    
    //sets playlist
    //calls play
    //seconds by default should be 0
    
        void play() {
    // Check if the songList is empty
    if (List.isEmpty()) {
        System.out.println("No songs in the playlist.");
        return;
    }
    
    while (!pause) {
        Song currentSong = List.get(positionInArrayList);
        int seconds = currentSong.getLength();
        
        for (int i = seconds; i > 0 && !pause; i--) {
            // Check if the home object is null
            if (home != null) {
                home.changeSongDuration(String.valueOf(i));
            } else {
                System.out.println("Home object is not initialized.");
                return;
            }
            
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (!pause) {
            positionInArrayList = (positionInArrayList + 1) % List.size();
        }
    }
}

        void pause() {
            pause = !pause;
            if (!pause) {
                play();
            }
        }

        void stopSong() {
            pause = true;
            positionInArrayList = 0;
            home.changeSongDuration("0");
        }

    // Concrete method to move to the next song in the playlist
    void skip() {
       seconds =0;
       if(positionInArrayList < List.size() ){
           positionInArrayList+=1;
       }
       else{
           positionInArrayList = 0;
       }
       
       play();
    } 
    
    
}
