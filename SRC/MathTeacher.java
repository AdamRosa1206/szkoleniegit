public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze Math teacher");
        this.school = school;
    }


    @Override
    public void walk() {
        super.walk();           // tu 'super' pozala na wywołanie nienadpisanej metody z klasy nadrzednej
        System.out.println("I walk very fast");
    }

    public void teachMath() {

        System.out.println("I'm teaching math");
    }

    public void sayHello() {
        System.out.println("Hello my namie is: " + name);
        System.out.println("I'm " + age);
    }
}
