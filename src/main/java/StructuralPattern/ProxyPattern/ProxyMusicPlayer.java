package StructuralPattern.ProxyPattern;

import java.util.HashMap;

public class ProxyMusicPlayer implements CarMusic{
    CarMusic carMusic;
    HashMap<String, String> alreadyPlayed = new HashMap<>();
    @Override
    public String playMusic(String songName) {
        if(alreadyPlayed.containsKey(songName)){
            return alreadyPlayed.get(songName);
        } else {
            carMusic = new MusicPlayer();
            String song = carMusic.playMusic(songName);
            alreadyPlayed.put(songName, song);
            return song;
        }
    }
}
