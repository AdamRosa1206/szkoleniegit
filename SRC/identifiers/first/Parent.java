package identifiers.first;

public class Parent {

    public String first = "public";
    String second = "default";
    protected String third = "protected";
    private  String fourth = "private";

    public void firstMethod() {
        System.out.println("public methoda");
    }
    void secomdMethod() {
        System.out.println("default methoda");
    }
    protected void thirdMethod() {
        System.out.println("protected methoda");
    }
    private void fourthMethod() {
        System.out.println("private methoda");
    }


    public void testIdentifier() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        firstMethod();
        secomdMethod();
        thirdMethod();
        fourthMethod();     // wewnątrz tej samej klasy mamy dostęp do wszystkich pól i metod

    }
}
