package PraceDomowe;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieram przegladarke z pomoca Chrome");
    }

    @Override
    public void findElementsBy() {
        System.out.println("Znajdujemy element z pomoca przegladarki Chrome");

    }
}
