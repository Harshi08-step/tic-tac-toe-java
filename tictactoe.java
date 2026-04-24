import java.util.Random;

public int getComputerMove(char[] board) {
    Random rand = new Random();
    int slot;

    while (true) {
        slot = rand.nextInt(9) + 1; // 1–9

        int index = slot - 1;

        if (board[index] != 'X' && board[index] != 'O') {
            return slot; // valid move found
        }
    }
}
