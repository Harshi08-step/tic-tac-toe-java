import java.util.Scanner;

public class TicTacToe {

    static Scanner sc = new Scanner(System.in);

    // UC3: Method to get valid slot input
    public static int getPlayerMove() {
        int slot;

        while (true) {
            System.out.print("Enter slot number (1-9): ");
            slot = sc.nextInt();

            if (slot >= 1 && slot <= 9) {
                return slot;
            } else {
                System.out.println("Invalid input! Enter number between 1 and 9.");
            }
        }
    }

    public static void main(String[] args) {

        // Calling UC3 method
        int move = getPlayerMove();

        System.out.println("You selected slot: " + move);
    }
}
