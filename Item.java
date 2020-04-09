class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	char tax;
	//TODO constructor

	//TODO setters and getters

	double taxReturn () {
		//TODO
		if (tax == 'A') return price*0.18*0.15;
		if (tax == 'B') return price*0.05*0.15;
		if (tax == 'C') return 0;
	}
}