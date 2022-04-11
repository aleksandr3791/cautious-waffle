package Podstawy;

public class OperatoryMatematyczne {

    public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;
        int fourthNumber = 5;
        int fifthNumber = 7;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiciplication = firstNumber * secondNumber;
        float division = thirdNumber / secondNumber;
        int mod = firstNumber % secondNumber; // modulo czyli reszta z dzielnia 4/6 to zero, reszta tutaj bedzie 4

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik dzielania " + division);

        // poniżej inny typ zapisu - nadpisywanie pierwszej zmiennej

        fourthNumber+=fifthNumber;
        System.out.println("Po dodaniu: " + fourthNumber);
        fourthNumber-=fifthNumber;
        fourthNumber*=fifthNumber;
        fourthNumber/=fifthNumber;







    }
}
