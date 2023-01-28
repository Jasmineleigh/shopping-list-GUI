package application;

import java.util.ArrayList;

public class List {
	private ArrayList<Item> items = new ArrayList<>();
	
	public List() {}

	public ArrayList<Item> getItems() {
		return items;
	}
	
	public boolean addItem(Item addItem) {
		if(!hasItem(addItem)) {
			items.add(addItem);
			return true;
		}
		updateItem(addItem);
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
	
	private boolean hasItem(Item item) {
		for(Item i: items) {
			if(i.getName().equals(item.getName()))
				return true;
		}
		return false;
	}
	
	private void updateItem(Item item) {
		for(int i = 0;i < items.size(); i++) {
			if(items.get(i).getName().equals(item.getName()))
				items.get(i).setAmount(item.getAmount()+items.get(i).getAmount());
		}
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
