import java.util.Scanner;


//Napisz program, który odpowie na pytanie, czy podane przez użytkownika słowo jest palindromem.
// Palindrom to słowo, które jest takie samo czytane od początku i od końca, np. kajak.

public class Palindrom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj slowo");
        String slowo = scanner.nextLine();
        boolean czyPalindrom = true;
        int dlugoscSlowa = slowo.length();

        for (int i = 0; i < dlugoscSlowa / 2 ;i++) {
            if (slowo.charAt(i) !=slowo.charAt((dlugoscSlowa-1-i))) {
                czyPalindrom = false;
                break;
            }
        }
        if (czyPalindrom) {
            System.out.println("Słowo " +slowo + " jest palindromem");
        } else {
            System.out.println("Słowo " + slowo + " nie jest palindromem");
        }

    }
}
