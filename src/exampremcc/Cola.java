
package exampremcc;

// Sub 2
public class Cola extends Drinks{
    private String variant;

    public Cola(String name, int price, String size, String variant){
        super.name = name;
        super.price = price;
        super.size = size;
        this.variant = variant;
    }
    
    public void setVariant(String variant){
        this.variant = variant;
    }
    
    public String getVariant(){
        return variant;
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
