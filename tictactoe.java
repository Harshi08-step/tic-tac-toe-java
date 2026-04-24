import java.util.Scanner;

public class TicTacToe {

    static Scanner sc = new Scanner(System.in);

    // Method to get user input
    public static int getPlayerMove() {
        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();
        return slot;
    }

    public static void main(String[] args) {

        int move = getPlayerMove();

        System.out.println("You entered slot: " + move);
    }
}
