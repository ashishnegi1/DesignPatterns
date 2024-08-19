package CreationalPattern.BuilderPattern;

public class Spoilers implements Item{
    @Override
    public String getName() {
        return "Rear Spoilers";
    }

    @Override
    public int getPrice() {
        return 10000;
    }
}
