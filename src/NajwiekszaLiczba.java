import java.util.Scanner;

public class NajwiekszaLiczba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba2;
        int najwiekszaLiczba;

        System.out.println("Podaj liczbe");
        najwiekszaLiczba = scanner.nextInt();

        while(true) {
            System.out.println("Czy chcesz zakończyc program? [t/n]");
            String czyKoniec = scanner.next();
                if (czyKoniec.equals("t")) {
                    break;
                }
            System.out.println();
            System.out.println("Podaj kolejną liczbe");
             liczba2 = scanner.nextInt();
             if (najwiekszaLiczba < liczba2) {
                 najwiekszaLiczba = liczba2;
             }

        }
        System.out.println(najwiekszaLiczba);


// dlaczego nie działa gdy w linii 15 "String czyKoniec = scanner.next(); :jest scanner.nextLine()

    }
}
