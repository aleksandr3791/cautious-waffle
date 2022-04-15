//stworz kalse bazowa App - zawiera pole name i metode appInfo, dodaj konstruktor do któregg przekarzesz wartosc name
// stworz klase potomna AndroidApp i IphoneApp - zawiera metode runAndroidApp / runIphoneApp

package PraceDomowe;

public class AppChecker {

    public static void main(String[] args) {

        AndroidApp andriodek = new AndroidApp("Androidek");
        IphoneApp iphonek = new IphoneApp("Iphonek");

        andriodek.appInfo();
        andriodek.runAndroidApp();

        iphonek.appInfo();
        iphonek.runIphoneApp();

    }

}
