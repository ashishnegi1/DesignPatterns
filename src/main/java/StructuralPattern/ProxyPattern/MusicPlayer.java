package StructuralPattern.ProxyPattern;

public class MusicPlayer implements CarMusic{
    @Override
    public String playMusic(String songName) {
        loadMusic(songName);
        return "Playing Song : " + songName;
    }
    private void loadMusic(String songName){
        System.out.println("Loading Song : " + songName);
    }
}
