public class Board {

    private char[] board;

    public Board() {
        board = new char[9];

        // initialize board with 1–9
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
    }

    // =========================
    // UC6: Update Board Method
    // =========================
    public boolean updateBoard(int slot, char symbol) {

        int index = slot - 1; // convert 1–9 to 0–8 index

        // check if slot is already occupied
        if (board[index] == 'X' || board[index] == 'O') {
            System.out.println("Invalid move: Slot already occupied.");
            return false;
        }

        // update board state
        board[index] = symbol;
        return true;
    }

    // Optional helper to display board
    public void printBoard() {
        System.out.println();

        for (int i = 0; i < 9; i++) {
            System.out.print(board[i] + " ");

            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        Board b = new Board();

        b.printBoard();

        b.updateBoard(5, 'X'); // valid move
        b.updateBoard(5, 'O'); // invalid move

        b.printBoard();
    }
}
