public class PersonTest {

    public static void main(String[] args) {

        MathTeacher teacher = new MathTeacher("Tom", 29, "School in Lublin");
        teacher.sayHello();
        teacher.teatchMath();
        teacher.eat();

        Footballer footballer = new Footballer("Mike", 21, "Motor Lublin");
        footballer.walk();
        footballer.playFootball();
        footballer.eat();

    }
}
