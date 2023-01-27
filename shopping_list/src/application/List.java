package application;

import java.util.ArrayList;

public class List {
	private ArrayList<Item> items = new ArrayList<>();
	
	public List() {}

	public ArrayList<Item> getItems() {
		return items;
	}
	
	public boolean addItem(Item addItem) {
		if(!items.contains(addItem)) {
			items.add(addItem);
			return true;
		}
		return false;
	}

	public Item getItem(String name) {
		for(Item item: items) {
			if(item.getName().equals(name)) {
				return item;
			}
		}
		return null;
	}
	
	public Item getItem(Item getItem) {
		return getItem(getItem.getName());
	}
	
	@Override
	public String toString() {
		String str = "";
		for(Item i:items) {
			str += i;
		}
		return str;
	}
}
