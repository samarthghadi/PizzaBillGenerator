
public class Pizza {
    private int price;
    private boolean veg;

    private int extraCheesePrice = 5;
    private int extraToppingsPrice = 2;

    private int takeAwayPrice = 8;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;


    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.price = 10;
        } else {
            this.price = 15;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        isOptedForTakeAway = true;
        this.price += takeAwayPrice;
    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza: $" +basePizzaPrice);
        if(isExtraCheeseAdded) {
            bill += "Extra Cheese Added: $" +extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded) {
            bill += "Extra Toppings Added: $" +extraToppingsPrice+ "\n";
        }
        if(isOptedForTakeAway) {
            bill += "TakeAway: $" +takeAwayPrice+ "\n";
        }
        bill += "Bill: $" +this.price + "\n";
        System.out.println(bill);
    }
}
