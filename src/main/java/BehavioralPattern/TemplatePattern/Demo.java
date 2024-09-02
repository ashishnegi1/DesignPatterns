package BehavioralPattern.TemplatePattern;

public class Demo {
    public static void main(String[] args) {

        GameTemplate game = new Cricket();
        game.play();
        System.out.println();

        game = new Football();
        game.play();

    }
}
