package Lesson4;

public class HomeWork4_9 {
    public static void main(String[] args) {
        String[][] chessboard = new String[8][8];
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessboard[i][j] = "W";
                } else {
                    chessboard[i][j] = "B";
                }
            }
        }
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                System.out.print(chessboard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
