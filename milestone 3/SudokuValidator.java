

import java.util.*;

public class SudokuValidator {

    public static boolean isValidSudoku(int[][] board) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            boolean[] seen = new boolean[10]; // index 1-9
            for (int j = 0; j < 9; j++) {
                int num = board[i][j];
                if (num != 0) {
                    if (seen[num]) return false;
                    seen[num] = true;
                }
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            boolean[] seen = new boolean[10];
            for (int i = 0; i < 9; i++) {
                int num = board[i][j];
                if (num != 0) {
                    if (seen[num]) return false;
                    seen[num] = true;
                }
            }
        }

        // Check 3x3 sub-grids
        for (int block = 0; block < 9; block++) {
            boolean[] seen = new boolean[10];
            int rowStart = (block / 3) * 3;
            int colStart = (block % 3) * 3;
            for (int i = rowStart; i < rowStart + 3; i++) {
                for (int j = colStart; j < colStart + 3; j++) {
                    int num = board[i][j];
                    if (num != 0) {
                        if (seen[num]) return false;
                        seen[num] = true;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[9][9];

        System.out.println("Enter the Sudoku board (9 rows with 9 numbers each, use 0 for empty cells):");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] < 0 || board[i][j] > 9) {
                    System.out.println("Invalid input! Only numbers 0-9 are allowed.");
                    return;
                }
            }
            sc.close();
        }

        if (isValidSudoku(board)) {
            System.out.println("The Sudoku board is VALID.");
        } else {
            System.out.println("The Sudoku board is INVALID.");
        }
        sc.close();
    }
}