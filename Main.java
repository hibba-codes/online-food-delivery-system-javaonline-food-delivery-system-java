public class Main
{
    public static void main(String[] args)
    {
        double totalPlatformSales = 0;
        Order[] orders = new Order[5];
        orders[0] = new RegularOrder("Hibba Iqbal", 101, "Palm Grill",
                "Zinger Burger", 2, 600);
        orders[1] = new ExpressOrder("Arooba Arshad", 104, "RT(Royal Taj)",
                "Chicken Tikka Pizza", 1, 1500, 1200);;
        orders[2] = new RegularOrder("Umima Afhsa", 107, "Grand Emaar",
                "Alfredo Pasta", 3, 750);
        orders[3] = new ExpressOrder("Kashaf Kamboh", 108, "New sukoon",
                "Chicken Biryani", 2, 700, 900);
        orders[4] = new RegularOrder("Dua Batool", 109, "Mirchi 360",
                "Chicken Chatni Roll", 5, 250);

        System.out.println("\n==========Online Food Delivery System==========\n");
        for(int i = 0; i < orders.length; i ++)
        {
            orders[i].showInfo();
            orders[i].calculate_Bill();
            totalPlatformSales += orders[i].getBill();
            System.out.println("============================================");
        }
        System.out.println("Total Platform Sales : " + totalPlatformSales);
        System.out.println("============================================");
    }
}
