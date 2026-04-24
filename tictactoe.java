import java.util.Random;

public class TossExample {

    public static void main(String[] args) {

        Random rand = new Random();

        int toss = rand.nextInt(2); // 0 or 1

        char player1Symbol, player2Symbol;
        char currentPlayer;

        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = player1Symbol;

            System.out.println("Player 1 starts and is 'X'");
            System.out.println("Player 2 is 'O'");
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = player2Symbol;

            System.out.println("Player 2 starts and is 'X'");
            System.out.println("Player 1 is 'O'");
        }

        System.out.println("Game starts with: " + currentPlayer);
    }
}


