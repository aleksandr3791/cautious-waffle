package PraceDomowe;

public class PracaDomowaPetle {

    //1 Wypisz liczby z zakresu 1-100 podzielne przez 3
    //2 Odwróć elementy z tablicy [1,3,5,7,0] -> [0,7,5,3,1]

    public static void main(String[] args) {

     //   for (int i=0; i<100; i++) {
     //       if (i%3==0) {
      //          System.out.println(i);
     //       }
     //   }


        int[] board = new int[] {1,3,5,7,0};
        for (int j = 0; j<(board.length)/2;j++) {
            int temp = board[j]; //dla j=0 1
            board[j] = board[board.length-1-j]; //4 -> 0 nadpisujemy pierwszy element tablicy czyli 1, ostatnim elementem
            board[board.length-1-j] = temp;
        }
        for (int j=0; j<board.length; j++) {
            System.out.println(board[j]);
        }

    }
}
