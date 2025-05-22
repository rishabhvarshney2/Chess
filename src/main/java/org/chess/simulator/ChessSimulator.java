package org.chess.simulator;

import org.chess.pieces.King;
import org.chess.pieces.Pawn;
import org.chess.pieces.Queen;
import org.chess.contract.ChessPiece;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ChessSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter piece and position (e.g. King D5): ");
        String[] input = sc.nextLine().split(",?\s+");

        ChessPiece piece;
        switch (input[0].toLowerCase()) {
            case "pawn":
                piece = new Pawn();
                break;
            case "king":
                piece = new King();
                break;
            case "queen":
                piece = new Queen();
                break;
            default:
                System.out.println("Invalid piece type.");
                return;
        }

        List<String> moves = piece.getValidMoves(input[1].toUpperCase());
        Collections.sort(moves);
        System.out.println("Valid moves: " + String.join(", ", moves));
    }
}
