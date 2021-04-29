
package exampremcc;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        // Objek akun admin kasir
        Costumer costumer = new Costumer("Wawan","CST01");
        // Objek program kasir
        ProgramStart start = new ProgramStart(costumer);
        start.mainmenuprogram(costumer);
    }
}

// Mulai program
class ProgramStart{
    Costumer costumer;
    
    ProgramStart(Costumer costumer){
        this.costumer = costumer;
    }
    ProgramStart() {
    }
    
    void mainmenuprogram(Costumer costumer){
        // Buat objek burger ayam lvl 1 - 3
        Burger burgerayam1 = new Burger("Chicken Burger", 5000, 1, "Chicken");
        Burger burgerayam2 = new Burger("Chicken Burger", 5500, 2, "Chicken");
        Burger burgerayam3 = new Burger("Chicken Burger", 6000, 3, "Chicken");
        // Buat objek burger sapi lvl 1 - 3
        Burger burgersapi1 = new Burger("Beef Burger", 7000, 1, "Beef");
        Burger burgersapi2 = new Burger("Beef Burger", 7500, 2, "Beef");
        Burger burgersapi3 = new Burger("Beef Burger", 8000, 3, "Beef");
        // Buat objek fries normal size
        Fries friesNML1 = new Fries("FF Normal", 1000, 1, "Normal");
        Fries friesNML2 = new Fries("FF Normal", 1500, 2, "Normal");
        // Buat objek fries large size
        Fries friesLRG1 = new Fries("FF Large", 2000, 1, "Large");
        Fries friesLRG2 = new Fries("FF Large", 2500, 2, "Large");
        // Buat objek Cola Starberry
        Cola colaredNML = new Cola("Cola Blood", 2000, "Normal", "Strawberry");
        Cola colaredLRG = new Cola("Cola Blood", 3000, "Large", "Strawberry");
        // Buat onjek Cola Lemon
        Cola colayelNML = new Cola("Cola Goold", 2000, "Normal", "Lemon");
        Cola colayelLRG = new Cola("Cola Goold", 3000, "Large", "Lemon");
        // Buat objek Juice Orange
        Juice jusorenNML = new Juice("Juice Orange", 4000, "Normal", "Orange");
        Juice jusorenLRG = new Juice("Juice Orange", 5000, "Large", "Orange");
        // Buat objek Juice Dragon
        Juice jusdragNML = new Juice("Juice Dragon Fruits", 5000, "Normal", "Dragon Fruits");
        Juice jusdragLRG = new Juice("Juice Dragon Fruits", 6000, "Large", "Dragon Fruits");
        
        // Mulai pilih makanan dari menu
        showmenu();
        Scanner terminalInput = new Scanner(System.in);
        String userInput;
        boolean iscontinu = true;
        
        
    }
    
    void showmenu(){
        System.out.println("");
        System.out.println(" ========== WELCOME TO JB BURGERS ========== ");
        System.out.println("---------------------------------------------");
        System.out.println("                  =FOODS=                    ");
        System.out.println("1. Burgers(Beef/Chicken)        Chilli  1/2/3");
        System.out.println("2. French FriesS(Normal/Large)  Chilli    1/2");
        System.out.println("");
        System.out.println("                  =DRINKS=                   ");
        System.out.println("3. Cola Blood                  (Normal/Large)");
        System.out.println("4. Cola Goold                  (Normal/Large)");
        System.out.println("5. Juice Orange                (Normal/Large)");
        System.out.println("6. Juice Dragon Fruits         (Normal/Large)");
        System.out.println("---------------------------------------------");
    }
}