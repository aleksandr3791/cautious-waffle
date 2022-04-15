package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    //klasa potomna w innej samej paczce nie ma dostępu do pól, metod PRIVATE i DEFAULT(PACKAGE)


    public void testIdentifier() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);

        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
    }
}
