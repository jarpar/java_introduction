package arrays;

public class ChessBoard {
    public static void main(String[] args) {
        board(8, 8);
    }

    static void board(int x, int y) {
        String[][] board = new String[x][y];
        String last = "#";
        for (int i = 0; i < x; i++) {
            if (y % 2 == 0) {
                if ("*".equals(last)) {
                    last = "#";
                } else {
                    last = "*";
                }
            }
            System.out.println();
            for (int j = 0; j < y; j++) {
                if ("*".equals(last)) {
                    last = "#";
                    board[i][j] = last;
                } else {
                    last = "*";
                    board[i][j] = last;
                }
                System.out.print(board[i][j] + " ");
            }
        }
    }
}
