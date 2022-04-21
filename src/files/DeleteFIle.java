package files;

import java.io.File;

public class DeleteFIle {

    public static void main(String[] args) {
        File file = new File("test.txt");

        if(file.delete()) {
            System.out.println("Usunelismy plik");
        } else {
            System.out.println("Nie udalo sie");
        }
    }
}
