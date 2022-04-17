package PraceDomowe;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieram przegladarke z pomoca Firefoxa");
    }

    @Override
    public void findElementsBy() {
        System.out.println("Szukam elementu w FIrefoxie");

    }
}
