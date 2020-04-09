class Receipt{
    List<Item> items;

    Receipt(){ this.items = new List<>(); }
    Receipt(List <Item> list){ this.items = list; }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public double getFullPrice(){
        double sum =0;
        for (Item i : items){
            if(i.getTax == 'A')
                sum += i.getPrice()*0.18 + i.getPrice();
            else if(i.getTax() == 'B')
                sum += i.getPrice()*0.05 + i.getPrice();
            else sum += i.getPrice();
        }
    }
}