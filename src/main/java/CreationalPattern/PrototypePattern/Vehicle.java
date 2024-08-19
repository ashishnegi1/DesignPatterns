package CreationalPattern.PrototypePattern;

public abstract class Vehicle implements Cloneable {

    private int id;
    protected String type;

    abstract void run();

    public int getId(){
        return id;
    }
    public void setId(int newId){
        id = newId;
    }

    public String getType(){
        return type;
    }

    @Override
    public Vehicle clone() {
        Vehicle clone = null;
        try {
            clone = (Vehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
