class VendingMachine {
    private int drinkStock = 10;
    private int moneyCollected = 0;
    protected String address = "near my home";

    public void buyDrink(int moneyInserted) {
        if (drinkStock > 0 && moneyInserted >= 20) {
            drinkStock--;
            moneyCollected += moneyInserted;
            System.out.println("Here is your cold drink! 🍹");
        } else if (drinkStock <= 0) {
            System.out.println("Sorry, out of stock!");
        } else {
            System.out.println("Please insert at least 20 rupees.");
        }
    }

    public int getDrinkStock() {
        return drinkStock;
    }

    public int getMoneyCollected() {
        return moneyCollected;
    }

    public void checkStock() {
        System.out.println("Drinks left: " + drinkStock);
        System.out.println("Address: " + address);
    }
}

public class Vendor {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.buyDrink(20);
        machine.checkStock();
        machine.address = "near BITM";
        System.out.println("New address: " + machine.address);
        System.out.println("Stock left: " + machine.getDrinkStock());
        System.out.println("Money collected: " + machine.getMoneyCollected());
    }
}
