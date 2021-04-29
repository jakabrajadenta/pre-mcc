
package javafundamental;

public class MainDasar {
    public static void main(String[] args) {
       int a = 5;
       int b = 6;
       int x = 42;
       int y = 11;
       double p = 42;
       double q = 11;
       int i=3;
       int j=4;
       
       int c = penjumlahan(a,b);
       System.out.printf("a + b = %d + %d = %d \n", a, b, c);
       
       int d = perkalian(a,b);
       System.out.printf("a * b = %d * %d = %d \n", a, b, d);
       
       int e = faktorial(a);
       System.out.printf("a! = %d! = %d \n", a, e);
       
       // Catatan x dan y bilangan bulat positif
       int z = modulus(x,y);
       System.out.printf("modulus (%d , %d) = %d \n", x, y, z);
       
       //int xx = (-30)%(20);
       //System.out.println(xx);
       double r = modulbagi(p,q);
       System.out.println(r);
       
       int k = perpangkatan(i, j);
        System.out.println("hasil pangkat = "+k);
    }
    
    static int penjumlahan (int a, int b){
        int c;
        c = a + b;
        return c;
    }
    static int perkalian (int a, int b){
        int d = 0;
        for (int i=0; i<b; i++){
            d = penjumlahan(d, a);
        }
        return d;
    }
    static int faktorial (int a) {
        int e = 1;
        for(int i=1; i<=a; i++){
            e = perkalian(e, i);
        }
        return e;
    }
    static int modulus (int x, int y){
        int z = 0;
        if (x>y){
            while (x>y) {                
                x -= y;
                if (x<y) {
                    z = x;
                    break;
                }
            }
        } else {
            z = x;
        }
        return z;
    }
    static double modulbagi(double p, double q){
        double r, s, t;
        r = p/q;
        s = Math.floor(r);
        t = (r-s)*q;
        return Math.floor(t);
    }
    
    static int perpangkatan(int a, int b){
    int c = 1;
    for(int i=1; i<=b; i++){
        c = perkalian(c,a);
    }
    return c;
    }

}
