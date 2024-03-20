package app;

public class SportShop {
    public static Order customerOrder(String tShirtColor, String capColor) {
        Product redTShirt = createTShirt(tShirtColor);
        Product whiteCap = createCap(capColor);

        return new Order(redTShirt, whiteCap);
    }

    private static Product createTShirt(String color) {
        return TShirtBuilder.create()
                .setColor(color)
                .setManufacturer("TM: 'Active sports'")
                .setPrice(11.49)
                .build();
    }

    private static Product createCap(String color) {
        return CapBuilder.create()
                .setColor(color)
                .setManufacturer("TM: 'Smart caps'")
                .setPrice(5.59)
                .build();
    }
}
