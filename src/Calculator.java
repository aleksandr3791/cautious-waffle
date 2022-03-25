import java.util.Scanner;

public class Calculator {

    // napisz program, który poprosi uzytkownika o dwie liczby, a następnie wykona na nich podstawowe operacje matematyczne

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę poniżej");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę poniżej");
        int secondNumber = scanner.nextInt();
        int thirdNumber = firstNumber + secondNumber;
        int fourthNumber = firstNumber - secondNumber;
        int fifthNumber = firstNumber * secondNumber;
        int sixthNumber = firstNumber/ secondNumber;
        System.out.println("Wynik dodawania to: " + thirdNumber);
        System.out.println("Wynik odejmowania to: " + fourthNumber);
        System.out.println("Wynik mnożenia to: " + fifthNumber);
        System.out.println("Wynik dzielenia to: " + sixthNumber);


    }
}
