class ExpressOrder extends Order
{
    int numberOfItems;
    double pricePerItem;
    double expressFee;
    public ExpressOrder(String name, int id, String restaurantName,String menu, int items, double price, double expressFee)
    {
        super(name, id, restaurantName, menu);
        this.numberOfItems = items;
        this.pricePerItem = price;
        this.expressFee = expressFee;
    }
    public void calculate_Bill()
    {
        double bill = (numberOfItems * pricePerItem) + expressFee;
        System.out.println("Price Per Item : " + pricePerItem);
        System.out.println("Number of Items : " + numberOfItems);
        if(expressFee > 1000)
        {
            System.out.println("Delivery Type : Priority Delivery");
        }
        else
        {
            System.out.println("Delivery Type : Standard Express");
        }
        System.out.println("Total Bill : " + bill);
    }
    public double getBill()
    {
        return pricePerItem * numberOfItems + expressFee;
    }
}
