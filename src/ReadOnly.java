public class ReadOnly {

    private String name;

    /*GETTER - pobranie wartości z pola prywatnego
    //skrót klawiszowy Alt + Insert

    public String getName() {
        return name;
        //albo return name + "jest ok";
    } */


    //SETTER - ustawienie wartości pola prywantnego

    /* public void setName(String name) {
        this.name = name;
    } */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
