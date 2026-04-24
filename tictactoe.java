public class TicTacToe {

    private char[] board = new char[9];
    private char currentPlayer = 'X';

    public TicTacToe() {
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
    }

    // Switch turns
    public void switchTurn() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Check draw condition
    public boolean isBoardFull() {
        for (char c : board) {
            if (c != 'X' && c != 'O') {
                return false;
            }
        }
        return true;
    }

    // Placeholder for win check (UC9 will implement real logic)
    public boolean checkWin() {
        return false;
    }

    // Game loop (UC8)
    public void startGame() {

        boolean gameRunning = true;

        while (gameRunning) {

            System.out.println("Player turn: " + currentPlayer);

            // UC3 / UC6 / UC7 will plug in here later
            // Example: updateBoard(slot, currentPlayer);

            if (checkWin()) {
                System.out.println(currentPlayer + " wins!");
                break;
            }

            if (isBoardFull()) {
                System.out.println("Game Draw!");
                break;
            }

            switchTurn();
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.startGame();
    }
}
