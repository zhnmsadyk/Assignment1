public class Pizza {
    private final String size;
    private final String dough;
    private final String sauce;
    private final String cheese;
    private final String toppings;
    private final boolean extraCheese;

    public Pizza(String size, String dough, String sauce, String cheese,
                 String toppings, boolean extraCheese) {

        this.size = size;
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
        this.extraCheese = extraCheese;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", toppings='" + toppings + '\'' +
                ", extraCheese=" + extraCheese +
                '}';
    }
}
