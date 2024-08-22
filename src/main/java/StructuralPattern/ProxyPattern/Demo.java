package StructuralPattern.ProxyPattern;

public class Demo {
    public static void main(String[] args) {
        CarMusic proxyMusicPlayer = new ProxyMusicPlayer();

        System.out.println(proxyMusicPlayer.playMusic("Alone"));
        System.out.println(proxyMusicPlayer.playMusic("Happy"));

        System.out.println(proxyMusicPlayer.playMusic("Alone"));
    }
}
