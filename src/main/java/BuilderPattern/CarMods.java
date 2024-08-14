package BuilderPattern;

import java.util.ArrayList;

public class CarMods {

    ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public int getCost(){
        int totalPrice = 0;
        for(Item item : items){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void showItems(){
        for(Item item : items){
            System.out.println("Item : " + item.getName() + ", Price : " + item.getPrice());
        }
    }

}
