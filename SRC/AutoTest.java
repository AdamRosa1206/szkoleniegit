public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rokProdukcji = 2022;
        mercedes.przebieg = 15000;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rokProdukcji = 2023;
        audi.przebieg = 0;

        audi.jedz();
        audi.hamuj();
        audi.info();


        Auto noname = new Auto();
        noname.jedz();
        noname.hamuj();
        noname.info();
    }
}
