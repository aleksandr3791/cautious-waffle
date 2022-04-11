public class Metody {

    public void policzWynik() {

        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println(result);
    }

    public int pobierzWynik() {

        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println(result);
        return result;
    }

    public void policzWynikParam(int number) {
        System.out.println("Number ma warosc: " + number);
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + i;
        }
        System.out.println(result);
    }

    public void add(int firstNumber, int secondNumber) {
        System.out.println("SUma to: " + (firstNumber + secondNumber));

    }
}
