import java.util.Scanner;

public class ZadaniaPetle {

    public static void main(String[] args) {

        //Napisz program z użyciem pętli while, który wypisuje wszystkie liczby od 1 do 10 (włącznie),
        // oddzielone przecinkami, poza liczbą 10, po której nie powinno być przecinka.

  /*      int i = 1;
        do {
            if (i<10){
                System.out.println(i + ",");
            }
            else {
                System.out.println(i);
            }
            i++;
        } while (i<=10);

        while (i<10);
*/

        //Napisz program, który policzy i wypisze silnię liczby, którą poda użytkownik.
        // Silnia to iloczyn kolejnych liczb całkowitych od 1 do danej liczby, np. silnia 5 to 1 * 2 * 3 * 4 * 5, czyli 120. Silnia liczby 0 to 1.


   /*     Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int silnia = scanner.nextInt();
        int n = 1;

        if (silnia > 0) {
            for (int i = 1; i <= silnia; i++) {
                n = n * i;
            }
            System.out.println(n);

        } else if (silnia < 0) {
            System.out.println("Podaj liczbę dodatnią");

        } else {
            System.out.println("Silnia dla 0 to 1");
        }

    */

//Choinka

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowita dla podstawy choinki");
        int base = scanner.nextInt();

        if (base%2==0) {

            for (int i = 1; i <= base; i++) {
                System.out.print("*");
            }


        } else {

        }


    }
}
