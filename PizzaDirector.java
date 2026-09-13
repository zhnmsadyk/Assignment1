public class PizzaDirector {

    public Pizza prepareClassicPizza(PizzaBuilder builder) {
        return builder
                .setSize("Large")
                .setDough("Thin")
                .setSauce("Tomato")
                .setCheese("Mozzarella")
                .setToppings("Pepperoni")
                .setExtraCheese(true)
                .build();
    }

    public Pizza prepareVegetarianPizza(PizzaBuilder builder) {
        return builder
                .setSize("Medium")
                .setDough("Thin")
                .setSauce("Tomato")
                .setCheese("Mozzarella")
                .setToppings("Vegetables and mushrooms")
                .setExtraCheese(false)
                .build();
    }
}
