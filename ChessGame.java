import java.util.Scanner;

public class ChessGame {
    private static char[][] board;

    public static void main(String[] args) {
        initializeBoard();
        displayBoard();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter move (e.g., 'a2 a4'): ");
            String move = scanner.nextLine();

            if (isValidMove(move)) {
                makeMove(move);
                displayBoard();
            } else {
                System.out.println("Invalid input. Please enter a valid move.");
            }
        }
    }

    private static void initializeBoard() {
        board = new char[8][8];
        // Set up initial pieces on the board
        // 'P' represents a pawn, 'R' a rook, 'N' a knight, 'B' a bishop, 'Q' a queen,
        // and 'K' a king.
        for (int i = 0; i < 8; i++) {
            board[1][i] = 'P'; // White pawns
            board[6][i] = 'p'; // Black pawns
        }
        board[0][0] = board[0][7] = 'R'; // White rooks
        board[7][0] = board[7][7] = 'r'; // Black rooks
        board[0][1] = board[0][6] = 'N'; // White knights
        board[7][1] = board[7][6] = 'n'; // Black knights
        board[0][2] = board[0][5] = 'B'; // White bishops
        board[7][2] = board[7][5] = 'b'; // Black bishops
        board[0][3] = 'Q'; // White queen
        board[7][3] = 'q'; // Black queen
        board[0][4] = 'K'; // White king
        board[7][4] = 'k'; // Black king
    }

    private static void displayBoard() {
        // Display column labels
        System.out.println("  a b c d e f g h");
        System.out.println(" +----------------");

        // Display rows and pieces
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + "|");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");
        }

        // Display column labels
        System.out.println(" +----------------");
        System.out.println();
    }

    private static boolean isValidMove(String move) {
        // Validate that the input follows the format 'a2 a4'
        if (move.matches("[a-h][1-8] [a-h][1-8]")) {
            int fromRow = 8 - Character.getNumericValue(move.charAt(1));
            int fromCol = move.charAt(0) - 'a';
            int toRow = 8 - Character.getNumericValue(move.charAt(4));
            int toCol = move.charAt(3) - 'a';

            // Add logic for valid move checking here
            // For simplicity, always return true for now
            return true;
        } else {
            return false;
        }
    }

    private static void makeMove(String move) {
        int fromRow = 8 - Character.getNumericValue(move.charAt(1));
        int fromCol = move.charAt(0) - 'a';
        int toRow = 8 - Character.getNumericValue(move.charAt(4));
        int toCol = move.charAt(3) - 'a';

        char piece = board[fromRow][fromCol];
        board[fromRow][fromCol] = ' '; // Empty the source square
        board[toRow][toCol] = piece; // Move the piece to the destination square
    }
}
