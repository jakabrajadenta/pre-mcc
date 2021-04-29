
package exampremcc;

// Sub 2
public class Fries extends Foods {
    private String size;

    public Fries(String name, int price, int chilvl, String size){
        super.name = name;
        super.price = price;
        super.chilvl = chilvl;
        this.size = size;
    }
    
    public void setSize(String size){
        this.size = size;
    }
    
    public String getSize(){
        return size;
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
    public int getChiLvl(){
        return chilvl;
    }
}