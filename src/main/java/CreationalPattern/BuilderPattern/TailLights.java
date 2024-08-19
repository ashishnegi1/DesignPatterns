package CreationalPattern.BuilderPattern;

public class TailLights implements Item{
    @Override
    public String getName() {
        return "LED Tail Lights";
    }

    @Override
    public int getPrice() {
        return 20000;
    }
}
