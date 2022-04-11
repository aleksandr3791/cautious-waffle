package Podstawy;

public class InkrementacjaDekramentacja {

    public static void main(String[] args) {
        //inkrementacja - zwiększenie wartości o 1

        // preinkrementacja

        int a = 0;
        System.out.println("Wartość a: " + a);
        int b = a++;
        System.out.println("Wartość b: " + b);
        System.out.println("Wartość a: " + a);

        //postinkrementacja
        int c = ++a;
        System.out.println("Wartość c: " + c);
        System.out.println("Wartość a: " + a);

        //dekrementacja - zmniejszenie wartości o 1

        int d = 0;
        int e = d--;
        int f = --d;

    }
}
