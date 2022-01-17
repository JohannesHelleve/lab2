package INF101.lab2;

import java.time.LocalDate;

public class FridgeItem implements Comparable<FridgeItem> {

	private String name;
	private LocalDate expirationDate;
	
	public FridgeItem(String name, LocalDate expirationDate) {
		this.name = name;
		this.expirationDate = expirationDate;
	}
	
	/**
	 * Checks the expiration date of the item against the current date.
	 * If the expiration date is later than the current date then the item 
	 * has expired
	 * 
	 * @return true if fridge item has expired
	 */
	public boolean hasExpired() {
		return LocalDate.now().isAfter(expirationDate);
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getExpirationDate() {
		return expirationDate;
	}
	
	@Override
	public String toString() {
		return name + ", " + expirationDate;
	}

	@Override
	public int compareTo(FridgeItem o) {		
		return expirationDate.compareTo(o.expirationDate);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof FridgeItem))
			return false;
		
		FridgeItem other = (FridgeItem) obj;
		if (!this.name.equals(other.name))
			return false;
		if (!this.expirationDate.equals(other.expirationDate))
			return false;
		return true;
	}

}
