public class tablice {

    public static void main(String[] args) {
        String[] imiona = new String[3]; // trojka oznacza ilosc miejsc w tablicy, [] wskazuje na typ danych tablica
        imiona[0] = "Bartek";
        imiona[1] = "Adam";
        imiona[2] = "Ania";
/*
        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);

      int[] lottonumbers = new int[] {24,17,3,4,5,21};  // z tego wypisujemy wartosci
        System.out.println(lottonumbers[0]);
        System.out.println(lottonumbers[1]);
        System.out.println(lottonumbers[2]);
        System.out.println(lottonumbers[3]);
        System.out.println(lottonumbers[4]);
        System.out.println(lottonumbers[5]);

        System.out.println(lottonumbers.length); // wypisuje wielkosc tablicy - w tym przypadku 6*/


        for (int i=0; i< imiona.length; i++) {
            System.out.println(imiona[i]);
        }
    }

}
