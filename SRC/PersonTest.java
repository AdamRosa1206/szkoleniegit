public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 25, "University");
    /*    teacher.name = "Tom";
        teacher.age = 21;
        teacher.school = "University";*/
        teacher.walk();
        teacher.eat();
        teacher.sayHello();


        Footballer footballer = new Footballer("Mike", 21, "Mtd united");
/*        footballer.name = "Mike";
        footballer.age = 25;
        footballer.footballclub = "Mtd United";*/
        footballer.walk();
        footballer.eat();
        footballer.playfootball();
    }
}
