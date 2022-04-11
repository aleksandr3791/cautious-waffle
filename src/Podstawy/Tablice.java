package Podstawy;

public class Tablice {

    public static void main(String[] args) {

        String[] imiona = new String[3];
        imiona[0] = "Ala";
        imiona[1] = "Frania";
        imiona[2] = "Kasia";
     //   System.out.println(imiona[1]);

        int[] lottoNumbers = new int[] {1,2,3,4,5,6};
    //    System.out.println(lottoNumbers[0]);
    //    System.out.println(lottoNumbers[3]);
    //    System.out.println(lottoNumbers.length);    //podaje długość tablicy - ile jest elementów


        for (int i=0; i<imiona.length; i++) {
            System.out.println(imiona[i]);
        }

        for (int j=0; j<lottoNumbers.length; j++) {
            System.out.println(lottoNumbers[j]);
        }

    }
}
