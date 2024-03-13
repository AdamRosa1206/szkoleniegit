// Stworz klase bazowa app - zawiera pole name i metode app info, dodaj konstruktor do ktorego prekazesz name
// stworz klasy potomne AndroidApp i IphoneApp - zawiera metode runAndroidApp / runIphoneApp
public class App {

    public String name;

    public App(String name) {
        this.name = name;
    }
    public void appInfo() {
        System.out.println("Testowa informacja o aplikacji");
    }
}
