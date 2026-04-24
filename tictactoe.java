import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];

        // Initialize board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        char currentPlayer = 'X';

        // Game loop (for 9 moves max)
        for (int turn = 0; turn < 9; turn++) {

            // Print board
            System.out.println("\nCurrent Board:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            // Take input
            System.out.println("Player " + currentPlayer + ", enter row and column (0-2):");
            int row =
