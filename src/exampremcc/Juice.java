
package exampremcc;

// Sub 2
public class Juice extends Drinks{
    private String fruit;

    public Juice(String name, int price, String size, String fruit){
        super.name = name;
        super.price = price;
        super.size = size;
        this.fruit = fruit;
    }
    
    public void setFruit(String fruit){
        this.fruit = fruit;
    }
    
    public String getFruit(){
        return fruit;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public int getPrice(){
        return price;
    }
    @Override
    public String getSize(){
        return size;
    }
}
