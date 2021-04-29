
package examprojectpremcc;

public class SistemAkun {
    private String username, password, name;
    
    protected void setUsername(String username){
        this.username = username;
    }
    protected String getUsername(){
        return username;
    }
    
    protected void setPassword(String password){
        this.password = password;
    }
    protected String getPassword(){
        return password;
    }
    
    protected void setName(String name){
        this.name = name;
    }
    protected String getName(){
        return name;
    }
}
