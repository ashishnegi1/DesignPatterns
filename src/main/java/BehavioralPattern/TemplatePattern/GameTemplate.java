package BehavioralPattern.TemplatePattern;

public abstract class GameTemplate {
    abstract void initialize();
    abstract void startGame();
    abstract void endPlay();

    public final void play(){

        initialize();
        startGame();
        endPlay();

    }
}
