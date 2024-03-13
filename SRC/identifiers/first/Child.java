package identifiers.first;

public class Child extends Parent {


    // klasa potomna (w tej samej paczce) nie ma dostępu do pól i metod typu private - tutaj fourth
    public void testIdentifiers() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    //    System.out.println(fourth);
        firstMethod();
        secomdMethod();
        thirdMethod();
    //    fourthMethod();

    }
}
