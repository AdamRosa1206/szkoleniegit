// Metoda - blok ktory zawiera jakies instrukcje
// moze byc uruchomiona (wywolana) poprzez odwolanie sie do jej nazwy

public class Metoda {

/*    public void policzWynik() {              //użycie typu void oznacza że ta metoda nie może zwrocic wartosci
        System.out.println("Zaraz policze wynik ");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Wartosc to " + result);
    }*/


    public int pobierzWynik() {              //użycie typu void oznacza że ta metoda nie może zwrocic wartosci
        System.out.println("Zaraz policze wynik ");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Wartosc to " + result);
        return result;
    }

        public void policzWynikParam(int number) {              //w tej metodzie używamy parametru int
            System.out.println("Number ma watosc " + number);
        System.out.println("Zaraz policze wynik ");
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + i;
        }
        System.out.println("Wartosc to " + result);
    }

    public int add(int firstnumber, int secondnumber) {
        System.out.println("Suma to: " + (firstnumber + secondnumber));
        return firstnumber + secondnumber;

    }
}




   /* public void sum() {
        int firstnumber = 0;
        int secondnumber = 2;
    System.out.println("Suma to " + (firstnumber+secondnumber));

    public String imie(); {
        System.out.println("Nazywam się Tomek");
        return "Tomek";
    }
}

}
*/