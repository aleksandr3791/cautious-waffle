package PraceDomowe;

public class WebDriverTestRefactorPolimorfizm {
    public static void main(String[] args) {

    WebDriver driver = getDriver("chrome");
    driver.get();
    driver.findElementsBy();
}

    private static WebDriver getDriver(String name) {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        return null;

    }

}