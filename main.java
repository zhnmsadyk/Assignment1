public class Main {

    public static void main(String[] args) {

        PizzaDirector director = new PizzaDirector();

        Pizza classicPizza = director.prepareClassicPizza(
                new ClassicPizzaBuilder()
        );

        Pizza vegetarianPizza = director.prepareVegetarianPizza(
                new VegetarianPizzaBuilder()
        );

        System.out.println("Classic Pizza:");
        System.out.println(classicPizza);

        System.out.println();

        System.out.println("Vegetarian Pizza:");
        System.out.println(vegetarianPizza);

        System.out.println();

        Pizza customPizza = new ClassicPizzaBuilder()
                .setSize("Small")
                .setDough("Thick")
                .setSauce("BBQ")
                .setCheese("Cheddar")
                .setToppings("Chicken")
                .setExtraCheese(false)
                .build();

        System.out.println("Custom Pizza:");
        System.out.println(customPizza);
    }
}
