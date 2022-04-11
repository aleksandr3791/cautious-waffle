package Podstawy;

public class Switch {

    public static void main(String[] args) {

        String dish = "Sushi";

        switch (dish) {
            case "Pizza":
                System.out.println("Cena to 22 zł");
                break;
            case "Losos":
                System.out.println("Cena to 25 zł");
                break;
            case "Frytki":
                System.out.println("Cena to 9 zł");
                break;
            default:
                System.out.println("Nie ma dania w karcie");
        }

    }
}
