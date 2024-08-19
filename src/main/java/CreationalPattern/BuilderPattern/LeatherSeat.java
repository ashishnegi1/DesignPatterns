package CreationalPattern.BuilderPattern;

public class LeatherSeat implements Item{
    @Override
    public String getName() {
        return "Leather seat covers";
    }

    @Override
    public int getPrice() {
        return 20000;
    }
}
