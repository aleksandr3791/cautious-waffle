package PraceDomowe;

//pobierz wiek od uzytkownika, jeżlei bedzie mniejszy niz 0, wyrzuc yjatek PraceDomowe.InvalidAgeException
// jeslei mmay 18>= możemy wypisać, ze jestes pelnoletni, w innym przypadku wypisz, ze niepelnoletni


import java.util.Scanner;

public class UserName {
    public static void main(String[] args) throws InvalidAgeException {

        System.out.println("Podaj swoj wiek");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age<0) {
            throw new InvalidAgeException("Invalid age");
        }
        if (age >= 18) {
            System.out.println("Jestes pelnoletni");
        } else {
            System.out.println("Jestes niepelnoletni");
        }
    }
    }