// STworz trzy obiekty klasy Student. Przypisz wartosci do pol. Stworz tablice i dodaj wartosci do tablicy
//Przejdz przez studentow w tablicy i wywolaj wszytskie 4 metody

public class PracaDomowaStudent {

    public static void main(String[] args) {

        Student student001 = new Student();
        student001.imie = "Paulina";
        student001.nazwisko = "Kowalska";
        student001.nick = "Pako";
        student001.numerIndeksu = 001;
        student001.email = "paulina.kowalska@test.com";

        Student student002 = new Student();
        student002.imie = "Sara";
        student002.nazwisko = "Burczyk";
        student002.nick = "Sabu";
        student002.numerIndeksu = 002;
        student002.email = "saraburczyk@test.com";

        Student student003 = new Student();
        student003.imie = "Bartlomiej";
        student003.nazwisko = "Niedzwiedzki";
        student003.nick = "Bani";
        student003.numerIndeksu = 003;
        student003.email = "bartlomiejniedzwiedzki@test.com";


        Student[] students = new Student[3];
        students[0] = student001;
        students[1] = student002;
        students[2] = student003;

        for (int i = 0; i <students.length; i++) {
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();
            students[i].zalogujSie();
            System.out.println();
        }




    }
}
