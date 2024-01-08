# ChessGame
The provided code is a simple console-based implementation of a chess game in Java. It allows users to input moves in the format "a2 a4" to make pawn moves on a chessboard. The chessboard is displayed after each move, and the program continues to prompt the user for moves until terminated.

Here's an overview of the key components:

1. **initializeBoard():**
   - Initializes the chessboard with pieces in their starting positions.
   - Uses a two-dimensional char array to represent the board.

2. **displayBoard():**
   - Prints the current state of the chessboard to the console.
   - Displays column labels (a to h) and row numbers (1 to 8) for better readability.

3. **isValidMove(String move):**
   - Checks if the entered move is in the correct format (e.g., 'a2 a4').
   - Converts move coordinates to row and column indices.
   - Placeholder logic; actual move validation rules are not implemented.

4. **makeMove(String move):**
   - Updates the chessboard based on the provided move.
   - Converts move coordinates to row and column indices.
   - Moves the piece from the source square to the destination square.
   - Empties the source square after the move.

5. **main(String[] args):**
   - Initializes the chessboard, displays it, and enters a loop to accept user moves.
   - Prompts the user for moves, validates them, and updates the board accordingly.
   - Continues until terminated.

This code is a starting point for a chess game, and several improvements and additional features could be added, such as implementing the rules for different chess pieces, detecting check and checkmate, handling castling and en passant, and providing a more interactive user interface. The provided code focuses on the basic structure and mechanics of a chess game.
