public class ClassicPizzaBuilder extends PizzaBuilder {

    @Override
    public Pizza build() {
        validate();

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
