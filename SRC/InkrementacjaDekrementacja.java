public class InkrementacjaDekrementacja {


   //inkrementacja wartosci o 1
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Wartosc a: " + a); //0
        int b = a++;  //  zapis ++ oznacza zwiększenie wartosci o 1
        System.out.println("Wartosc b: " + b); // 0 - postinkrmentacja - na poczatku przypisana wartosc to
        System.out.println("Wartosc a: " + a); // 1
        int c = ++a;
        System.out.println("Wartosc c: " + c); //2 preinkrementacja
        System.out.println("Wartosc a: " + a); //2


    // dekrementacja watosci o 1

        int d = 0;
        System.out.println("Wartosc d: " + d); //0
        int e = d--;  //  zapis -- oznacza zmniejszenie wartosci o 1
        System.out.println("Wartosc e: " + e); // 0 - posdekrementacja - na poczatku przypisana wartosc to
        System.out.println("Wartosc d: " + d); // -1
        int f = --d;
        System.out.println("Wartosc f: " + f); //-2 predekrementacja
        System.out.println("Wartosc d: " + d); //-2
    }

}
