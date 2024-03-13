package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    // klasa potomna (w innej samej paczce) nie ma dostępu do pól i metod typu private oraz default (czyli bez identyfikatora) - fourth i second

    public void testIdentifiers() {
        System.out.println(first);
     //   System.out.println(second);
        System.out.println(third);
     //   System.out.println(fourth);
        firstMethod();
     //   secomdMethod();
        thirdMethod();
     //   fourthMethod();

    }
}
