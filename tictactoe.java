// UC5: Validate move
public static boolean isValidMove(char[][] board, int row, int col) {

    // Check boundaries (0–2)
    if (row < 0 || row > 2 || col < 0 || col > 2) {
        return false;
    }

    // Check if cell is empty
    if (board[row][col] != '-') {
        return false;
    }

    return true;
}
