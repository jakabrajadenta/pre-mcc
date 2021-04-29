
package exampremcc;

// Sub 2
public class Burger extends Foods {
    private String meat;

    public Burger(String name, int price, int chilvl, String meat){
        super.name = name;
        super.price = price;
        super.chilvl = chilvl;
        this.meat = meat;
    }
    
    public void setMeat(String meat){
        this.meat = meat;
    }
    
    public String getMeat(){
        return meat;
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