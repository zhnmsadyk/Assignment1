public abstract class PizzaBuilder {
    protected String size;
    protected String dough;
    protected String sauce;
    protected String cheese;
    protected String toppings;
    protected boolean extraCheese;

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder setToppings(String toppings) {
        this.toppings = toppings;
        return this;
    }

    public PizzaBuilder setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
        return this;
    }

    protected void validate() {
        if (isBlank(size) || isBlank(dough) || isBlank(sauce)
                || isBlank(cheese) || isBlank(toppings)) {

            throw new IllegalStateException(
                    "Pizza cannot be built: all required fields must be filled."
            );
        }
    }

    protected boolean isBlank(String value) {
        return value == null || value.isBlank();
    }

    public abstract Pizza build();
}
