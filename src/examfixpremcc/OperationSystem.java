
package examfixpremcc;

import java.util.ArrayList;
import java.util.Scanner;

public class OperationSystem extends Operation {

    @Override
    public String loginProcess(Account account1) {
        String loginprocess = null;
        int chance = 3;
        do {
            System.out.println("------------- Login System -------------");
            Scanner inputUsername = new Scanner(System.in);
            System.out.print("Username  : ");
            String inputUser = inputUsername.nextLine();

            Scanner inputPassword = new Scanner(System.in);
            System.out.print("Password  : ");
            String inputPass = inputPassword.nextLine();
            
            if (inputUser.equals(account1.getUsername()) && inputPass.equals(account1.getPassword())) {
                loginprocess = "true";
                break;
            } else {
                System.out.println("Wrong input username or password");
                loginprocess = "false";
                chance -= 1;
            }
        } while (chance > 0);
        return loginprocess;
    }

    @Override
    public String loginSystem(Account account1) {
        String result;
        result = loginProcess(account1);
        if (result.equals("true")) {
            System.out.println("-------------   WELCOME~   -------------");
            System.out.println("Name    : " + account1.getName());
            System.out.println("Address : " + account1.address.getStreet() + ", " + account1.address.getPostcode() + " " + account1.address.getCity());
            System.out.println("Balane  : " + account1.getBalance());
        } else {
            System.out.println("Break the limit wrong password. Try it later!");
            System.exit(0);
        }
        return result;
    }

    @Override
    public String shoppingItems(Account account1) {
        String startlist = loginSystem(account1);
        // balance = account.getBalance();
        // payment = 0;
        if (startlist.equalsIgnoreCase("true")) {
            System.out.println("----------------------------------------\n");
            ArrayList<String> itemsList = new ArrayList<>();
            ArrayList<String> itemsCart = new ArrayList<>();
            itemsList.add("TS01 -   White T-Shirt           25k");
            itemsList.add("TS02 -   Black T-Shirt           25k");
            itemsList.add("PL01 -   Blue Polo Shirt         40k");
            itemsList.add("PL02 -   Grey Polo Shirt         40k");
            itemsList.add("ST01 -   Flower Shirt            80k");
            itemsList.add("ST02 -   Splash Shirt            60k");
            itemsList.add("JS07 -   Black Jeans             100k");
            itemsList.add("JS08 -   Navi Jeans              115k");
            itemsList.add("SW03 -   Brown-line Sweater      75k");
            itemsList.add("SW04 -   Vintage Sweater         90k");
            itemsList.add("JK11 -   Army Jacket             155k");
            itemsList.add("JK12 -   Parka Jacket            135k");
            itemsList.add("SH21 -   Sport Shoes             115k");
            itemsList.add("SH22 -   Casual Shoes            90k");
            
            int shipping = 10000;
            int balance = account1.getBalance() - shipping;
            int payment = 0;
            while (true) {                
                System.out.println("============== ITEMS LIST ==============");
                System.out.println("----------------------------------------");
                System.out.println("CODE -  Product Name            Price   ");
                System.out.println("----------------------------------------");
                itemsList.forEach(list -> {System.out.println(list);});
                System.out.println("checkout\nreset cart");
                System.out.println("----------------------------------------");
                System.out.println("");
                System.out.println("============== YOURS CART ==============");
                itemsCart.forEach(list -> {System.out.println(list);});
                System.out.println("----------------------------------------");
                Scanner userInput = new Scanner(System.in);
                System.out.print("Insert Code : ");
                String itemscode = userInput.nextLine();
                
                if (itemscode.equalsIgnoreCase("TS01")) {
                    if (balance > 25000) {
                        balance -= 25000;
                        payment += 25000;
                        itemsCart.add("White T-Shirt");
                        System.out.println("White T-Shirt added to cart");
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                    } else {
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                        System.out.println("Your balance not enough");
                    }
                } else if (itemscode.equalsIgnoreCase("TS02")) {
                    if (balance > 25000) {
                        balance -= 25000;
                        payment += 25000;
                        itemsCart.add("Black T-Shirt");
                        System.out.println("Black T-Shirt added to cart");
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                    } else {
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                        System.out.println("Your balance not enough");
                    }
                } else if (itemscode.equalsIgnoreCase("PL01")) {
                    if (balance > 40000) {
                        balance -= 40000;
                        payment += 40000;
                        itemsCart.add("Blue Polo Shirt");
                        System.out.println("Blue Polo Shirt added to cart");
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                    } else {
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                        System.out.println("Your balance not enough");
                    }
                } else if (itemscode.equalsIgnoreCase("PL02")) {
                    if (balance > 40000) {
                        balance -= 40000;
                        payment += 40000;
                        itemsCart.add("Grey Polo Shirt");
                        System.out.println("Grey Polo Shirt added to cart");
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                    } else {
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                        System.out.println("Your balance not enough");
                    }
                } else if (itemscode.equalsIgnoreCase("ST01")) {
                    if (balance > 80000) {
                        balance -= 80000;
                        payment += 80000;
                        itemsCart.add("Flower Shirt");
                        System.out.println("Flower Shirt added to cart");
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                    } else {
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                        System.out.println("Your balance not enough");
                    }
                } else if (itemscode.equalsIgnoreCase("ST02")) {
                    if (balance > 60000) {
                        balance -= 60000;
                        payment += 60000;
                        itemsCart.add("Splash Shirt");
                        System.out.println("Splash Shirt added to cart");
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                    } else {
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                        System.out.println("Your balance not enough");
                    }
                } else if (itemscode.equalsIgnoreCase("JS07")) {
                    if (balance > 100000) {
                        balance -= 100000;
                        payment += 100000;
                        itemsCart.add("Black Jeans");
                        System.out.println("Black Jeans added to cart");
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                    } else {
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                        System.out.println("Your balance not enough");
                    }
                } else if (itemscode.equalsIgnoreCase("JS08")) {
                    if (balance > 115000) {
                        balance -= 115000;
                        payment += 115000;
                        itemsCart.add("Navi Jeans");
                        System.out.println("Navi Jeans added to cart");
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                    } else {
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                        System.out.println("Your balance not enough");
                    }
                } else if (itemscode.equalsIgnoreCase("SW03")) {
                    if (balance > 75000) {
                        balance -= 75000;
                        payment += 75000;
                        itemsCart.add("Brown-line Sweater");
                        System.out.println("Brown-line Sweater added to cart");
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                    } else {
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                        System.out.println("Your balance not enough");
                    }
                } else if (itemscode.equalsIgnoreCase("SW04")) {
                    if (balance > 90000) {
                        balance -= 90000;
                        payment += 90000;
                        itemsCart.add("Vintage Sweater");
                        System.out.println("Vintage Sweater added to cart");
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                    } else {
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                        System.out.println("Your balance not enough");
                    }
                } else if (itemscode.equalsIgnoreCase("JK11")) {
                    if (balance > 155000) {
                        balance -= 155000;
                        payment += 155000;
                        itemsCart.add("Army Jacket");
                        System.out.println("Army Jacket added to cart");
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                    } else {
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                        System.out.println("Your balance not enough");
                    }
                } else if (itemscode.equalsIgnoreCase("JK12")) {
                    if (balance > 135000) {
                        balance -= 135000;
                        payment += 135000;
                        itemsCart.add("Parka Jacket");
                        System.out.println("Parka Jacket added to cart");
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                    } else {
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                        System.out.println("Your balance not enough");
                    }
                } else if (itemscode.equalsIgnoreCase("SH21")) {
                    if (balance > 115000) {
                        balance -= 115000;
                        payment += 115000;
                        itemsCart.add("Sport Shoes");
                        System.out.println("Sport Shoes added to cart");
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                    } else {
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                        System.out.println("Your balance not enough");
                    }
                } else if (itemscode.equalsIgnoreCase("SH22")) {
                    if (balance > 90000) {
                        balance -= 90000;
                        payment += 90000;
                        itemsCart.add("Casual Shoes");
                        System.out.println("Casual Shoes added to cart");
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                    } else {
                        System.out.println("Your balance now : " + balance);
                        System.out.println("Checkout Payment : " + payment);
                        System.out.println("Your balance not enough");
                    }
                } else if (itemscode.equalsIgnoreCase("checkout")) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("----------------------------------------");
                    System.out.println("Your Items Cart Now: ");
                    itemsCart.forEach(list -> {System.out.println(list);});
                    System.out.println("-----------------------------");
                    System.out.println("Items payment      : " + payment);
                    System.out.println("Shipping charges   : " + shipping);
                    int total = payment + shipping;
                    System.out.println("-----------------------------");
                    System.out.println("Total Payment      : " + total);
                    System.out.println("----------------------------------------");
                    System.exit(0);
                } else if (itemscode.equalsIgnoreCase("reset") || itemscode.equalsIgnoreCase("reset cart")) {
                    for (int i = itemsCart.size() - 1; i >= 0; i--) {
                        itemsCart.remove(i);
                    }
                    System.out.println("KRS anda telah di hapus");
                    balance = account1.getBalance();
                    payment = 0;
                } else {
                    System.out.println("Invalid Items Code");
                }
            }
        }
        
        return null;
    }
    
}
