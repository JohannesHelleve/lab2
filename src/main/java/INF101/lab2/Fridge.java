package INF101.lab2;

import java.util.List;

public class Fridge implements IFridge{


    @Override
    public int nItemsInFridge() {
        int MAX = 20;
        
        return 0;
    }

    @Override
    public int totalSize() {
        return 0;
    }

    @Override
    public boolean placeIn(FridgeItem item) {
        return false;
    }

    @Override
    public void takeOut(FridgeItem item) {

    }

    @Override
    public void emptyFridge() {

    }

    @Override
    public List<FridgeItem> removeExpiredFood() {
        return null;
    }
}
