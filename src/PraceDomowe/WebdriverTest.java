//stworz interface WebDriver, który bedzie mial dowe metody get() i findElementsBy()
//dodaj dwie klasy ChroeDriver i FirefoxDriver, ktore beda implementowaly ten interface

package PraceDomowe;

public class WebdriverTest {

    public static void main(String[] args) {

        ChromeDriver chrome = new ChromeDriver();
        chrome.get();
        chrome.findElementsBy();

        FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        firefox.findElementsBy();
    }
}
