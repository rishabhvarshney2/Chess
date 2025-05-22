# Chess Piece Moves Simulator

This is a simple Java-based console application that simulates the movement of chess pieces (King, Queen, and Pawn) on an **empty 8x8 chessboard**.

## 📌 Features

- Supports **King**, **Queen**, and **Pawn** piece movements.
- Takes a position input like `King D5` and prints all valid moves.
- Includes a utility for handling chessboard coordinates (`BoardUtils`).
- Clean OOP structure with one class per piece implementing a `ChessPiece` interface.

---

## 🧱 Chessboard Layout

The chessboard is an 8x8 grid, with:
- Rows labeled 1 to 8 (bottom to top)
- Columns labeled A to H (left to right)

Example positions:
- `A1` (bottom-left corner)
- `H8` (top-right corner)

---

## 🕹️ How to Use

1. **Compile the Program**  
   Compile all `.java` files together:
   ```bash
   javac *.java
