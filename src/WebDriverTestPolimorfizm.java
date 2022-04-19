import PraceDomowe.ChromeDriver;
import PraceDomowe.FirefoxDriver;
import PraceDomowe.WebDriver;
public class WebDriverTestPolimorfizm {

        public static void main(String[] args) throws NoValidBrowserName {

            WebDriver driver = getDriver("chrome");
            driver.get();
            driver.findElementsBy();
        }

        private static WebDriver getDriver(String name) throws NoValidBrowserName {
            if (name.equals("chrme")) {
                return new ChromeDriver();
            } else if (name.equals("firefox")) {
                return new FirefoxDriver();
            }
            throw new  NoValidBrowserName("No valid browser name");

        }

    }
