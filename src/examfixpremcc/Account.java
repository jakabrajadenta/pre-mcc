
package examfixpremcc;

public class Account {
    private String name, username, password;
    private int balance;
    Address address;

    public Account(Address address) {
        this.address = address;
    }
    
    void setUsername(String username){
        this.username = username;
    }
    String getUsername(){
        return username;
    }
    
    void setPassword(String password){
        this.password = password;
    }
    String getPassword(){
        return password;
    }
    
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    
    void setBalance(int balance){
        this.balance = balance;
    }
    int getBalance(){
        return balance;
    }
}
