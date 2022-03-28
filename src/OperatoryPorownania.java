public interface OperatoryPorownania {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;

        boolean result = secondNumber > firstNumber;
        System.out.println(result);

        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);
        System.out.println(firstNumber == secondNumber); // pojedynczy znak równości to było by nadpisanie wartości
        System.out.println(firstNumber != secondNumber);


    }
}
