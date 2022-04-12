public class UserTest {

    public static void main(String[] args) {
       /*  User user = new User();
         user.username = "Bartek";
         user.password = "Admin123";
         user.sayHello;    */



         User user2 = new User("Wojtek", "qwerty");
        System.out.println(user2.username);
        System.out.println(user2.password);
        user2.sayHello();
    }
}
