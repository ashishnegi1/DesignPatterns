package CreationalPattern.BuilderPattern;

public class Exhaust implements Item{
    @Override
    public String getName() {
        return "Exhaust";
    }

    @Override
    public int getPrice() {
        return 25000;
    }
}
