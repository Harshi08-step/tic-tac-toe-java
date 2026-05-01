// UC10: Check for draw
public boolean isDraw() {

    // If any cell is not X or O → moves still possible
    for (int i = 0; i < 9; i++) {
        if (board[i] != 'X' && board[i] != 'O') {
            return false;
        }
    }

    // No empty cells → draw
    return true;
}
