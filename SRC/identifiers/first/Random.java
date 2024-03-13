package identifiers.first;

public class Random {

    // klasa w tej samej paczce (nie jest potomna) - nie ma dosępu do private

    Parent parent = new Parent();

    public void testIdentifiers() {
        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        //   System.out.println(parent.fourth);
        parent.firstMethod();
        parent.secomdMethod();
        parent.thirdMethod();
        //  parent.fourthMethod();
    }
}