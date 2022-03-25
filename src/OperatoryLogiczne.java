public class OperatoryLogiczne {

    public static void main(String[] args) {

        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && operator 'i' -> true wtedy, gdy wyrażenia składowe są równe true
        System.out.println(firstValue && secondValue); //rezulatt powinien być false
        System.out.println(firstValue && fourthValue); // rezultat powinien być true

        // || operator 'lub' -> true wtedy, gdy jedno wyrażenie składowe jest równe true
        System.out.println(firstValue || secondValue); //rezultat powinien byc true
        System.out.println(secondValue || thirdValue); //rezultat powinien byc false

        // ! negacja -> zwraca wartość przeciwną do wyrażenia przed którym się znajduje
        System.out.println(!firstValue); // rezultat powinien być false
        System.out.println(!secondValue); //rezultat powinien byc true
        System.out.println(!(firstValue && secondValue)); // rezultat powinien być true
    }
}
