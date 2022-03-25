import java.sql.SQLOutput;
import java.util.Scanner;

public class CustomScanner {

  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elo! Wpisz imie poniżej");
        String name = scanner.nextLine();
        System.out.println("Cześć " +  name + "!");


    } */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Kwardat tej liczby to: " + result);
    }


}
