public class Footballer extends Person {

    public String footballclub;

    public Footballer(String name, int age, String footballclub) {
        super(name, age);
        System.out.println("Jestem w konstruktorze Footballer");
        this.footballclub = footballclub;
    }

    @Override
    public void eat() {
        System.out.println("I like healthly food");
    }

    public void playfootball() {
        eat();
        walk();
        System.out.println("I'm playing football" + footballclub);
    }
}
