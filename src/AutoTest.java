public class AutoTest {

    public static void main(String[] args) {

    /*    Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 2015;
        mercedes.przebieg = 200000;

        mercedes.hamuj();
        mercedes.jedz();
        mercedes.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rok = 2013;
        audi.przebieg = 350000;

        audi.info();

        Auto noName = new Auto();

        noName.info();    */

        Auto fiat = new Auto("Fiat", "Uno", 2010, 300000);
        Auto opel = new Auto("Opel", "Corsa", 2018, 100000);

        fiat.info();
        opel.info();

    }
}
