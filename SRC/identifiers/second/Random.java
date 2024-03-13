package identifiers.second;

import identifiers.first.Parent;

public class Random {

    // klasa w innej paczce (która nie jest potomna) ma dostęp tylko do pól i metod public
    public void testIdentifiers() {

        Parent parent = new Parent();

        System.out.println(parent.first);
    //    System.out.println(parent.second);
    //    System.out.println(parent.third);
    //    System.out.println(parent.fourth);
        parent.firstMethod();
    //    parent.secomdMethod();
    //    parent.thirdMethod();
    //    parent.fourthMethod();

    }


}
