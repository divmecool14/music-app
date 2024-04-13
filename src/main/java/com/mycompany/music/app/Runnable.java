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
    
    void play(){
        if(seconds ==0){
       int seconds =  (List.get(positionInArrayList)).getLength();//gets length of first song
        }
        while(pause == false){
       while( seconds!= 0 ){
           String strSeconds = ""+seconds;
           home.changeSongDuration(strSeconds);
            try {
                    Thread.sleep(1000); // Sleep for 1 second
                    seconds--; // Decrease the remaining length by 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
             }
             if(positionInArrayList < List.size() ){
           positionInArrayList+=1;
            }
            else{
                positionInArrayList = 0;
               int seconds =  (List.get(positionInArrayList)).getLength();
            }
        }
       
       
    }
    
    

    // Concrete method to pause the currently playing song
    void pause() {
        if(pause == false){
            pause = true;
        }else{ 
            pause = false;
            play();
        }
        
    }

    // Concrete method to stop the song that is currently playing
    void stopSong() {
       pause = true;
       seconds = 0;
       
       
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
