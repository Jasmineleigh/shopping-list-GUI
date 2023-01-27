package application;

public class Item {
	private String name;
	private int amount;
	
	public Item(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		String str = String.format("%s\t%d\n", name, amount);
		return str;
	}
}
