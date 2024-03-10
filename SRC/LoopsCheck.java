// Wypisz liczby z zakresu 1-100 podzielne przez 3
// odwrocić elementy tablicy [1,3,5,7.0] => [0,7,5,3,1]

public class LoopsCheck {

   public static void main(String[] args) {
  /*      int numbers = 100;
        for (int i = 1; i < numbers; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }*/

       int[] numbers = new int[]{1, 3, 5, 7, 0};

       for (int i = 0; i < (numbers.length / 2); i++) {
           int temp = numbers[i];  // dla i=0 1     i=1 3
           numbers[i] = numbers[numbers.length - 1 - i];    // 4=>8 3=>7
           numbers[numbers.length - 1 - i] = temp;  // 1 // numers[3] =3
           System.out.println("Iteracja numer " + i);
       }

           for (int i = 0; i < numbers.length; i++) {
               System.out.println(numbers[i]);

           }

       }
   }


