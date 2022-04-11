package Podstawy;

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
//        System.out.println("Wpisz pierwszą liczbę");
//        int firstNumber = scanner.nextInt();
//        int result = firstNumber * firstNumber;
//        System.out.println("Kwardat tej liczby to: " + result);


        System.out.println("Co chciałbyś zjeść?");
        String dish = scanner.nextLine();
/*
        if (dish.equals("Losos")) {
            System.out.println("Cena to 25zl.");
        } else if (dish.equals("Pizza")) {
            System.out.println("Cena to 19zl.");
        } else {
            System.out.println("Nie mamy takiego dania w karcie.");
*/
//        }

        switch (dish) {
            case "Losos": {
                System.out.println("Cena to 25zl.");
                break;
            }
            case "Pizza": {
                System.out.println("Cena to 19zl.");
                break;
            }
            default: {
                System.out.println("Nie mamy takiego dania w karcie.");
            }
        }

    }


}
