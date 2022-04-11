package PraceDomowe;
/*zapytaj użytkowanika o wiek.
      W przypadku, gdy ma mniej niż 18 lat, wypisz na ekranie informacje, że nie może kupić alkoholu.
      Gdy ma więcej niż 18 lat to podziękuj za zakupy
       */

import java.util.Scanner;

public class PracaDomowaAgeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int age = scanner.nextInt();

        if (age >=18) {
            System.out.println("Dziękuję za zakup alkoholu! :D");
        } else if ( age < 0){
            System.out.println("Wprowadź prawidłową wartość");
        } else {
            System.out.println ("Nie możesz kupić alkoholu :( ");
        }


    }
}
