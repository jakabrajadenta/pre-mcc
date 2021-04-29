
package exampremcc;

// Class objek data Costumer
class Costumer{
    private String name, codeID;
    // Konstruk kelas ini
    public Costumer(String name, String codeID) {
        this.name = name;
        this.codeID = codeID;
    }
    public Costumer(){
        
    }
    // setter-getter name
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    // setter-getter codeID
    void setCodeID(String codeID){
        this.codeID = codeID;
    }
    String getCodeID(){
        return codeID;
    }
}
