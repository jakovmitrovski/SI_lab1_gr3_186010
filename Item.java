class Item {
	int id;
	String name;
	double price;
	char taxType;

	//TODO add variable.

	//TODO constructor

	//TODO setters and getters


	public Item(int id, String name, double price, char taxType) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.taxType = taxType;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setTaxType(char taxType) {
		this.taxType = taxType;
	}

	public char getTaxType() {
		return taxType;
	}

	double taxReturn () {
		double danok = 0;
		if (taxType == 'А') danok = price*0.18;
		else if (taxType == 'Б') danok = price*0.05;

		return danok*0.15;
	}
}