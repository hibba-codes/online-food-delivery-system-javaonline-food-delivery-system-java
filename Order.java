abstract class Order
{
    private String customerName;
    private int orderID;
    private String restaurantName;
    private String menuItem;

    public Order(String name, int id, String restaurantName, String menu)
    {
        this.customerName = name;
        this.orderID = id;
        this.restaurantName = restaurantName;
        this.menuItem = menu;
    }

    public void setCustomerName(String name)
    {
        this.customerName = name;
    }
    public String getCustomerName()
    {
        return customerName;
    }
    public void setOrderID(int id)
    {
        this.orderID = id;
    }
    public int getOrderID()
    {
        return orderID;
    }
    public void setMenuItem(String menu)
    {
        this.menuItem = menu;
    }
    public String getMenuItem()
    {
        return menuItem;
    }
    public void setRestaurantName(String restaurantName)
    {
        this.restaurantName = restaurantName;
    }
    public String getRestaurantName()
    {
        return restaurantName;
    }

    public void showInfo()
    {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Order ID : " + orderID);
        System.out.println("Restaurant Name : " + restaurantName);
        System.out.println("Menu Item : " + menuItem);
    }
    public abstract void calculate_Bill();
    public abstract double getBill();

}
