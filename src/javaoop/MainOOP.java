
package javaoop;

public class MainOOP {
    public static void main(String[] args) {
        System.out.println("\nBuat objek dengan parameter awal");
        // Persegi dengan 1 parameter
        Shape sqr = new Square(5);
        System.out.println("PERSEGI");
        sqr.showL();
        sqr.showK();
        // Persegi panjang dengan 2 parameter
        Shape rct = new Rectangle(8,5);
        System.out.println("PERSEGI PANJANG");
        rct.showL();
        rct.showK();
        
        System.out.println("\nUpdate parameter sebelumnya");
        //Update parameter persegi
        System.out.println("PERSEGI");
        sqr.setS(8);
        sqr.getL();
        sqr.getK();
        sqr.showL();
        sqr.showK();
        //Update parameter persegi panjang
        System.out.println("PERSEGI PANJANG");
        rct.setP(20);
        rct.setLbr(5);
        rct.getL();
        rct.getK();
        rct.showL();
        rct.showK();
        
    }
}

// pilar abstrak disertai polimorfisme overriding di sub class
abstract class Shape {
    int L, K;
    
    abstract int getL();
    abstract int getK();
    abstract void showL();
    abstract void showK();
    
    void setS(int i){
        
    }
    void setP(int i) {
        
    }
    void setLbr(int i) {
    
    }
    
}

// pilar pewarisan int L,K dan methodnya
class Square extends Shape {
    private int s; // pilar enkapsulasi dengan setter getternya
    
    Square (int s) {
        this.s = s;
        super.L = s*s;
        super.K = 4*s;
    }
    Square(){
        
    }
    
    @Override
    void setS(int s){
        this.s = s;
    }
    int getS(){
        return s;
    }
    
    @Override
    int getL(){
        L = s*s;
        return L;
    }

    @Override
    int getK() {
        K = 4*s;
        return K;
    }

    @Override
    void showL() {
        System.out.printf("L =  %d * %d  = %d\n", s, s, L);
    }

    @Override
    void showK() {
        System.out.printf("L =  4 * %d  = %d\n", s, K);
    }
}

// pilar pewarisan int L,K dan methodnya
class Rectangle extends Shape {
    private int p, l; // pilar enkapsulasi dengan setter getternya
    
    Rectangle (int p, int l){
        this.p = p;
        this.l = l;
        super.L = p*l;
        super.K = 2*(p+l);
    }
    Rectangle () {
        
    }
    
    @Override
    void setP(int p){
        this.p = p;
    }
    int getP(){
        return p;
    }
    @Override
    void setLbr(int l){
        this.l = l;
    }
    int getLbr(){
        return l;
    }
    
    @Override
    int getL(){
        L = p*l;
        return L;
    }

    @Override
    int getK() {
        K = 2*(p+l);
        return K;
    }

    @Override
    void showL() {
        System.out.printf("L =  %d * %d  = %d\n", p, l, L);
    }

    @Override
    void showK() {
        System.out.printf("L = 2*(%d+%d) = %d\n", p, l, K);
    }
}
