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

        Calculator calculator = new Calculator();

        int addition = calculator.add(firstNumber,secondNumber);
        int substraction = calculator.sub(firstNumber,secondNumber);
        int multiplication = calculator.mul(firstNumber,secondNumber);
        int division = calculator.div(firstNumber,secondNumber);
        int mod = calculator.mod(firstNumber,secondNumber);



        System.out.println("Wynik dodawania to: " + addition);
        System.out.println("Wynik odejmowania to: " + substraction);
        System.out.println("Wynik mnożenia to: " + multiplication);
        System.out.println("Wynik dzielenia to: " + division);
        System.out.println("Wynik modulo to: " + mod);

    }

}
