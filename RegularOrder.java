class RegularOrder extends Order
{
    int numberOfItems;
    double pricePerItem;
    public RegularOrder(String name, int id, String restaurantName, String menu, int items, double price)
    {
        super(name, id, restaurantName, menu);
        this.numberOfItems =  items;
        this.pricePerItem = price;
    }
    public void calculate_Bill()
    {
        double bill = pricePerItem * numberOfItems;
        System.out.println("Number Of Items : " + numberOfItems);
        System.out.println("Price Per Item = " + pricePerItem);
        if(bill > 5000)
        {
            System.out.println("Delivery Charges : Free Delivery");
        }
        else
        {
            bill += 300;
            System.out.println("Added Delivery Charges : 300");
        }
        System.out.println("Total Bill : " + bill);
    }
    public double getBill(){
        double bill = pricePerItem * numberOfItems;

        if(bill <= 5000)
        {
            bill += 300;
        }

        return bill;
    }
}
