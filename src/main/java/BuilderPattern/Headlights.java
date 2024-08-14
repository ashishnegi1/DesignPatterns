package BuilderPattern;

public class Headlights implements Item{
    @Override
    public String getName() {
        return "Projector Headlights";
    }

    @Override
    public int getPrice() {
        return 35000;
    }
}
