package identifiers.first;

public class Child extends Parent{


    //klasa potomna w tej samej paczce nie ma dostępu do pól, metod PRIVATE

    public void testIdentifier(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
     //   System.out.println(fourth);

        firstMethod();
        secondMethod();
        thirdMethod();
    //    fourthMethod();

    }
}
