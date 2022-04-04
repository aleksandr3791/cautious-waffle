
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String czyKoniec;
        boolean czyBlednaOperacja;

        System.out.print("Podaj pierwsza liczbe: ");
        int liczba = scanner.nextInt();

       do {
           int wynik = 0;
           czyBlednaOperacja = false;

           System.out.print("Jakie dzialanie chcesz wykonac? [+ - * /] ");
           String dzialanie = scanner.next();
           System.out.print("Podaj kolejna  liczbe: ");
           int liczba2 = scanner.nextInt();

           switch (dzialanie) {
               case "+":
                    wynik = liczba + liczba2;
                    break;
               case "-":
                   wynik=liczba-liczba2;
                   break;
               case  "*":
                   wynik=liczba*liczba2;
                   break;
               case "/":
                   if (liczba2 == 0) {
                       czyBlednaOperacja = true;
                       System.out.println("Nie dzielimy przez 0!!!");
                   } else {
                   wynik=liczba/liczba2; }
                   break;
               default:
                   czyBlednaOperacja = true;
                   System.out.println("Nieprawidłowa operacja");
           }

           if (!czyBlednaOperacja) {
               System.out.println("Wynik to: " + wynik);
               liczba = wynik;
           }
           System.out.print("Czy zakonczyc program? [t/n] ");
           czyKoniec = scanner.next();

       } while (!czyKoniec.equals("t"));


    }
}
