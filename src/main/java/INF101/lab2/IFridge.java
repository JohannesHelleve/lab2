package INF101.lab2;

import java.util.List;

public interface IFridge {
	//test for gitlab and github//
	/**
	 * Returns the number of items currently in the fridge
	 * 
	 * @return number of items in the fridge
	 */
	int nItemsInFridge();

	/**
	 * The fridge has a fixed (final) max size.
	 * Returns the total number of items there is space for in the fridge
	 * 
	 * @return total size of the fridge
	 */
	int totalSize();

	/**
	 * Place a food item in the fridge. Items can only be placed in the fridge if
	 * there is space
	 * 
	 * @param item to be placed
	 * @return true if the item was placed in the fridge, false if not
	 */
	boolean placeIn(FridgeItem item);

	/**
	 * Remove item from fridge
	 * 
	 * @param item to be removed
	 * @throws NoSuchElementException if fridge does not contain <code>item</code>
	 */
	void takeOut(FridgeItem item);

	/**
	 * Remove all items from the fridge
	 */
	void emptyFridge();

	/**
	 * Remove all items that have expired from the fridge
	 * @return a list of all expired items
	 */
	List<FridgeItem> removeExpiredFood();

}
