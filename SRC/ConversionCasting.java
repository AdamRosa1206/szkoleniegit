public class ConversionCasting {

    public static void main(String[] args) {

        int a =2;
        double b= 4.23;

        double c = a/b; // konwersja niejawna a zostaje przekonwertowana na double

        int d = a/(int) b;

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();

        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
        firefoxDriver.get();
    }
}
