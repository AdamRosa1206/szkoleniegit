public class WebDriverTest  {

    public static void main(String[] args) throws NoValidBrowserName {

        WebDriver driver = getDriver("Firefoxa");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();




   /*  *//*   ChromeDriver chrome = new ChromeDriver();
        chrome.get();
        chrome.findElementBy();

        FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        firefox.findElementBy();*//*
    }*/



    }

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("Chrome")) {
            return new ChromeDriver();
        } else if (name.equals("Firefox")) {
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid message name");
    }


}
