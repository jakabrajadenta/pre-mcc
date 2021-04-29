
package examfixpremcc;

public class MainProgram {
    public static void main(String[] args) {
        Address address1 = new Address("Jatinegara 230", "Bandung", "40272");
        Account account1 = new Account(address1);
        account1.setName("Brajadenta");
        account1.setBalance(250000);
        account1.setUsername("a");
        account1.setPassword("a");
        
        MenuProgram mainmenu = new MenuProgram();
        mainmenu.shoppingItems(account1);
    }
}
