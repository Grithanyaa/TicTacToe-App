//uc4
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);

    }

    // Reads slot number from user (1–9)
    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();
        return slot;
    }
}public class TicTacToe {

    /**
     * Entry point of the program.
     * Demonstrates slot-to-index conversion.
     */
    public static void main(String[] args) {
        int slot = 7; // change this value (1–9) to test

        int row = getRowFromSlot(slot);
        int col = getColFromSlot(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }

    /**
     * Converts slot number into row index (0–2)
     * Input: slot (1–9)
     * Output: row index (0–2)
     */
    static int getRowFromSlot(int slot) {
        validateSlot(slot);
        return (slot - 1) / 3;
    }

    /**
     * Converts slot number into column index (0–2)
     * Input: slot (1–9)
     * Output: column index (0–2)
     */
    static int getColFromSlot(int slot) {
        validateSlot(slot);
        return (slot - 1) % 3;
    }

    /**
     * Validates slot input
     */
    static void validateSlot(int slot) {
        if (slot < 1 || slot > 9) {
            throw new IllegalArgumentException("Slot must be between 1 and 9");
        }
    }
}