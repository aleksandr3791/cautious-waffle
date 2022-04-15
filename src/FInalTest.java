public class FInalTest {

    //pola typu FINAL są niezmienialne, nie można ich nadpisać
    //jeśli chodzi o typu obiektowe, to nie można zrobic nadpisac obiektu


    public static void main(String[] args) {

        final int x = 2;

        final Person person = new Person("Tim", 26);
        person.age = 25;
    }
}
