package app;

public class App {
    public static void main(String[] args) {
        startApp();
    }

    public static void startApp() {
        Order orderA = SportShop.customerOrder("Color: Red", "Color: White");
        orderA.printOrderDetails();

        Order orderB = SportShop.customerOrder("Color: Blue", "Color: Black");
        orderB.printOrderDetails();
    }
}