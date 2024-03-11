import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwzą liczbę");
        int firstNumber  = scanner.nextInt();
       // Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();
    //    int result = firstNumber + secondNumber;

        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber/secondNumber;
        int mod = firstNumber%secondNumber;

        System.out.println("Wynik dodawania to: " + addition);
        System.out.println("Wynik odejmowania to: " + substraction);
        System.out.println("Wynik mnożenia to: " + multiplication);
        System.out.println("Wynik dzielenia to: " + division);
        System.out.println("Wynik modulo to: " + mod);

    }

}
