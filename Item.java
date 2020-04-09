class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	char tax;
	//TODO constructor
	Item(char tax, int id, String name, double price){
		this.tax = tax;
		this.id = id;
		this.name = name;
		this.price = price;
	}

	//TODO setters and getters
	
	public voitd setTax(char tax){
		this.tax = tax;
	}

	public voitd setId(int id){
		this.id = id;
	}

	public voitd setName(String name){
		this.name = name;
	}
	
	public voitd setPrice(){
		this.price = price;
	}	

	public char getTax(){
		return tax;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public double getPrice(){
		return price;
	}

	double taxReturn () {
		//TODO
		if (tax == 'A') return price*0.18*0.15;
		if (tax == 'B') return price*0.05*0.15;
		if (tax == 'C') return 0;
	}
}