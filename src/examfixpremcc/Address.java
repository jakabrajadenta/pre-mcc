
package examfixpremcc;

public class Address {
    private String street, city, postcode;
    
    Address (String street, String city, String postcode){
        this.street   = street;
        this.city    = city;
        this.postcode = postcode;
    }
    
    void setStreet(String street){
        this.street = street;
    }
    void setCity(String city){
        this.city = city;
    }
    void setPostcode(String postcode){
        this.postcode = postcode;
    }
    
    String getStreet(){
        return street;
    }
    String getCity(){
        return city;
    }
    String getPostcode(){
        return postcode;
    }
}
