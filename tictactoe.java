public boolean checkWin() {

    // Rows
    for (int i = 0; i < 9; i += 3) {
        if (board[i] == board[i + 1] && board[i] == board[i + 2]) {
            return true;
        }
    }

    // Columns
    for (int i = 0; i < 3; i++) {
        if (board[i] == board[i + 3] && board[i] == board[i + 6]) {
            return true;
        }
    }

    // Diagonals
    if (board[0] == board[4] && board[0] == board[8]) {
        return true;
    }

    if (board[2] == board[4] && board[2] == board[6]) {
        return true;
    }

    return false;
}
