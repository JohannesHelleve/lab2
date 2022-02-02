package INF101.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Fridge implements IFridge{
    int max;
    ArrayList<FridgeItem> fridgeItems;


    public Fridge(){
        fridgeItems = new ArrayList<>();
        max = 20;
    }

    @Override
    public int nItemsInFridge() {
        return fridgeItems.size();
    }

    @Override
    public int totalSize() {
        return max;
    }

    @Override
    public boolean placeIn(FridgeItem item) {
        if(nItemsInFridge() < totalSize()){
            fridgeItems.add(item);
            return true;
        }
        return false;
    }

    @Override
    public void takeOut(FridgeItem item) {
        if(fridgeItems.contains(item)){
            fridgeItems.remove(item);
        }else{
            throw new NoSuchElementException();
        }
    }

    @Override
    public void emptyFridge() {
        fridgeItems.clear();
    }

    @Override
    public List<FridgeItem> removeExpiredFood() {
        ArrayList<FridgeItem> expiredItems = new ArrayList<>();

        for(FridgeItem item : fridgeItems){
            if(item.hasExpired()){
                expiredItems.add(item);
            }
        }
        fridgeItems.removeAll(expiredItems);
        return expiredItems;
    }
}
