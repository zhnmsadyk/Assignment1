public class VegetarianPizzaBuilder extends PizzaBuilder {

    @Override
    public Pizza build() {
        validate();

        if (!toppings.toLowerCase().contains("vegetable")) {
            throw new IllegalStateException(
                    "Vegetarian pizza must contain vegetable toppings."
            );
        }

        return new Pizza(
                size,
                dough,
                sauce,
                cheese,
                toppings,
                extraCheese
        );
    }
}
