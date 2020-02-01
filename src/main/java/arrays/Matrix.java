package arrays;

//import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
        char[][] matrix = new char[][]{
                {'_', '*', '_'},
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'_', '*', '_'},
        };
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
