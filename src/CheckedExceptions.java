import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

  /* sposob 1

    public static void main(String[] args) throws FileNotFoundException {
        readFile("/src/dsfsf.txt");
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
   */

//sposob 2

  public static void main(String[] args) {
      try {
          System.out.println("Before reading file");
         // readFile("C:\\Users\\BRITENET\\Desktop\\Automat\\JavaSelenium\\src\\test.txt");
          readFile("/src/hjfjhg.txt");
      } catch (FileNotFoundException e) {
          System.out.println("Wyjatek zostal wyrzucony");
          System.out.println(e.getMessage());
      } finally {
          System.out.println("Closing file");
      }
  }
    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);

    }

}

