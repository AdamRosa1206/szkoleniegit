public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze Math teacher");
        this.school = school;
    }

    public void teachMath() {

        System.out.println("I'm teaching math");
    }

    public void sayHello() {
        System.out.println("Hello my namie is: " + name);
        System.out.println("I'm " + age);
    }
}
