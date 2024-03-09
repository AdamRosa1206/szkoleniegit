import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwzą liczbę");
        int firstNumber  = scanner.nextInt();
       // Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();
    //    int result = firstNumber + secondNumber;
        System.out.println("Wynik dodawania to: " + (firstNumber + secondNumber));
        System.out.println("Wynik odejmowania to: " + (firstNumber - secondNumber));

    }

}
