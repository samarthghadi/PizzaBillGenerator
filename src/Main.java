public class Main {
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(true);

        basePizza.addExtraCheese();
        basePizza.getBill();

        DeluxePizza deluxePizza = new DeluxePizza(false);
        deluxePizza.takeAway();
        deluxePizza.getBill();
    }
}