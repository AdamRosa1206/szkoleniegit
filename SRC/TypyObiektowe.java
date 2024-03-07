public class TypyObiektowe {

    // Liczby stałoprzecnkowe
    byte firstnumber = 127; // 1 bait -128 do 127
    short secondnumber = 3277; // 2 bajty
    int thirdnumber = 5454123;  // 4 bajty
    long fourtnumber = 6545657657657L; // bajtów

    // liczby zmiennoprzcinkowe
    float fifthnumber = 4.6545F; // 4 bajty - max ok 6-7 liczb po przecinku
    double sixthnumber  = 3.56465465445; // bajtów - max 15 cyfr przecinku

    // wartsc logiczna
    boolean prawda = true;
    boolean fałsz = false;

    // graficzne znak
    char letter = 'A';

    // Ciągi znaków
    String hello = "Hello Adam";

    public static void main(String[] args) {
        // Liczby stałoprzecnkowe
        Byte firstnumber = 127; // 1 bait -128 do 127
        Short secondnumber = 3277; // 2 bajty
        Integer thirdnumber = 5454123;  // 4 bajty
        Long fourtnumber = 6545657657657L; // bajtów

        // liczby zmiennoprzcinkowe
        Float fifthnumber = 4.6545F; // 4 bajty - max ok 6-7 liczb po przecinku
        Double sixthnumber  = 3.56465465445; // bajtów - max 15 cyfr przecinku

        // wartsc logiczna
        Boolean prawda = true;
        Boolean fałsz = false;

        // graficzne znak
        Character letter = 'A';

        // Ciągi znaków
        String hello = "Hello Adam";

        System.out.println(hello.charAt(0));


    }

}
