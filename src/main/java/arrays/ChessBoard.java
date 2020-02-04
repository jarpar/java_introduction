package arrays;

import java.util.Scanner;

public class ChessBoard {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        System.out.println(chessBoard);
    }

    @Override
    public String toString() {
        return print(x(), y());
    }

    static int x() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj X: ");
        return scanner.nextInt();
    }

    static int y() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Y: ");
        return scanner.nextInt();
    }

    static String print(int x, int y) {
        String[][] board = new String[x][y];
        String last = "#";
        StringBuilder stringBuilder = new StringBuilder();
        String string;
        for (int i = 0; i < x; i++) {
            if (y % 2 == 0) {
                if ("*".equals(last)) {
                    last = "#";
                } else {
                    last = "*";
                }
            }
            stringBuilder.append("\r\n");
            for (int j = 0; j < y; j++) {
                if ("*".equals(last)) {
                    last = "#";
                    board[i][j] = last;
                } else {
                    last = "*";
                    board[i][j] = last;
                }
                stringBuilder.append(board[i][j]).append(" ");
            }
        }
        string = stringBuilder.toString();
        return string;
    }
}