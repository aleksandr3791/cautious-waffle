package identifiers.second;

import identifiers.first.Parent;

public class Random {

    public void testIdentifier(){

        //klasa w innej paczce ma dostęp tylko do pól, metod PUBLIC

        Parent parent = new Parent();

        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        System.out.println(parent.fourth);
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
        parent.fourthMethod();

    }
}
