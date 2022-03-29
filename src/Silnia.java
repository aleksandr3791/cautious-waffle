    import java.util.Scanner;

    public class Silnia {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
       System.out.println("Podaj liczbę");
        int silnia = scanner.nextInt();
        int n = 1;

        if (silnia > 0) {
            for (int i = 1; i <= silnia; i++) {
                n = n * i;
            }
            System.out.println(n);

        } else if (silnia < 0) {
            System.out.println("Podaj liczbę dodatnią");

        } else {
            System.out.println("Silnia dla 0 to 1");
        }



        }
    }


