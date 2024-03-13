public class FinalTest {

    public static void main(String[] args) {

        // zmienna final nie pozwala na przypisanie nowej wartosci do tej zmienne
        final int x = 2;

        final Person person = new Person("Tim", 15);
        person.age = 27;


    }
}
