public class ReadOnly {

    private String name = "Adam";

    // tzw getter - metoda pozwalająca na odczytanie pola private - można odczytać to pole ale nie można zmienić wartosci
    public String getName() {
        return name + "jest ok";

    }

    // tzw. setter metodda która umożliwia ustawienie wartosci pola prywatnego
    public void setName(String name) {
        this.name = name;
    }



}
