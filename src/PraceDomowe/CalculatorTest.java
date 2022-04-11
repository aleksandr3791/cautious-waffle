package PraceDomowe;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwsza liczbe: ");
        int firstNUmber = scanner.nextInt();
        System.out.print("Podaj druga liczbe: ");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        System.out.println("Wynik dodawania to: " + calculator.addition(firstNUmber, secondNumber));
        System.out.println("Wynik odejmowania to: " + calculator.subtraction(firstNUmber,secondNumber));
        System.out.println("Wynik mnożenia to: " + calculator.multiplication(firstNUmber,secondNumber));
        System.out.println("Wynik dzielenia to: " + calculator.division(firstNUmber,secondNumber));
        System.out.println("Wynik modulto to: " + calculator.modulo(firstNUmber,secondNumber));

    }
}
