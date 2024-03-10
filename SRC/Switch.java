public class Switch {
    public static void main(String[] args) {
        String danie = "Hamburger";

        switch (danie) {
            case "Pizza":
                System.out.println("Cana to 22 zł");
                break;
            case "Hamburger":
                System.out.println("Cena to 20 zł");
                break;
            case "Frytki":
                System.out.println("Cena to 10 zł");
                break;
            default:
                System.out.println("Nie mamy tego dania w karcie");
        }
    }
}
