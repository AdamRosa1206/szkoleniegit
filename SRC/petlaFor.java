public class petlaFor {

    public static void main(String[] args) {

        int number = 61;
 /*       // i specjalna zmienna sterujaca = wszystkie liczby do zmiennej number liczone co 2
        for (int i =0; i < number; i=i+2) {
            System.out.println(i);
        }*/

        // i specjalna zmienna sterujaca - wszystkie liczby podzielne przez 5
        for (int i = 0; i < number; i++) {     // i=0 oznacza od kiedy jest liczone 1<number - do kiedy, i++ podbija wartosc o 1
            if (i % 5 == 0) {                   // jesli i modulo z 5 jest rowne 0 - wszystkie liczby podzielne przez 5
                System.out.println(i);

            }
        }
    }
}
