
package examprojectpremcc;

import java.util.Scanner;

public class LoginSystem {
    public String LoginProcess(SistemAkun akunadmin){
        String loginprocess = null;
        int chance = 3;
        do {
            System.out.println("---------- Login System ----------");
            Scanner inputUsername = new Scanner(System.in);
            System.out.print("Username  : ");
            String inputUser = inputUsername.nextLine();

            Scanner inputPassword = new Scanner(System.in);
            System.out.print("Password  : ");
            String inputPass = inputPassword.nextLine();
            
            if (inputUser.equals(akunadmin.getUsername()) && inputPass.equals(akunadmin.getPassword())) {
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
    
    public String LoginSystem(SistemAkun akunadmin){
        String result;
        result = LoginProcess(akunadmin);
        if (result.equals("true")) {
            System.out.println("----------   WELCOME~   ----------");
            System.out.println("Login admin as " + akunadmin.getName() + "....");
        } else {
            System.out.println("Break the limit wrong password. Try it later!");
            System.exit(0);
        }
        return result;
    }
    // return result = true ~~
}
