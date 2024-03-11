public class MetodyTest {
    public static void main(String[] args) {
        Metoda metoda = new Metoda();
/*        metoda.policzWynik();
        metoda.policzWynik();
        metoda.policzWynik();*/
/*        int result = metoda.pobierzWynik();
        int result2 = result *2;
        System.out.println("Rezultat przed mnozeniem to " + result);
        System.out.println("Rezultat po mnozeniu to " + result2);*/

        metoda.policzWynikParam(2);
        metoda.policzWynikParam(100);
        metoda.policzWynikParam(23);

        int result = metoda.add(2,5);
        System.out.println(metoda.add(2,3));
        System.out.println(result);

    }
}
