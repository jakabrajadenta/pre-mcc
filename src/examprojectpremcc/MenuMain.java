
package examprojectpremcc;

import java.io.IOException;
import java.util.Scanner;

public class MenuMain extends OperationSystem {
    SistemAkun akunadmin;
    
    MenuMain(SistemAkun akunadmin){
        this.akunadmin = akunadmin;
    }
    MenuMain(){
        
    }
    
    public void mulaiProgram(SistemAkun akunadmin) throws IOException{
        LoginSystem login = new LoginSystem();
        String lanjut = login.LoginSystem(akunadmin);
        
        if (lanjut.equals("true")) {
            Scanner terminalInput = new Scanner(System.in);
            String userOption;
            boolean iscontinu = true;
            
            while (iscontinu){
                System.out.println("======= MAIN MENU =======");
                System.out.println("1.  Show Sales Data");
                System.out.println("2.  Find Sales Data");
                System.out.println("3.  Add Sales Data");
                System.out.println("4.  Remove Sales Data");
                System.out.println("5.  Exit");
                
                System.out.println("Input your option: ");
                userOption = terminalInput.nextLine();
                switch(userOption){
                    case "1":
                        showData();
                        break;
                    case "2":
                        findData();
                        break;
                    case "3":
                        addData();
                        showData();
                        break;
                    case "4":
                        removeData();
                        showData();
                        break;
                    case "5":
                        System.out.println("Thank you for logged in");
                        System.exit(0);
                    default:
                        System.err.println("Please choose 1 - 5");
                }
                iscontinu = continuORno("Do you want to continue?");
            }
        }
    }
    private boolean continuORno(String message){
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + message + " (y/n)? ");
        String userOption = terminalInput.next();

        while(!userOption.equalsIgnoreCase("y") && !userOption.equalsIgnoreCase("n")) {
            System.err.println("Please choose y or n");
            System.out.print("\n" + message + " (y/n)? ");
            userOption = terminalInput.next();
        }

        return userOption.equalsIgnoreCase("y");
    }
}
