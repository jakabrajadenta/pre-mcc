
package examprojectpremcc;

import java.io.IOException;

public class MainProgram {
    public static void main(String[] args) throws IOException {
        SistemAkun akunadmin = new SistemAkun();
        akunadmin.setUsername("a");
        akunadmin.setPassword("a");
        akunadmin.setName("Jaka Brajadenta");
        
        MenuMain mainmenu = new MenuMain();
        mainmenu.mulaiProgram(akunadmin);
    }
}
