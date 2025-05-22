package org.chess.pieces;

import org.chess.contract.ChessPiece;
import org.chess.util.BoardUtils;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements ChessPiece {
    @Override
    public List<String> getValidMoves(String position) {
        List<String> moves = new ArrayList<>();
        int[] pos = BoardUtils.fromCell(position);
        int row = pos[0] - 1;
        int col = pos[1];
        if (BoardUtils.isValidPosition(row, col)) {
            moves.add(BoardUtils.toCell(row, col));
        }
        return moves;
    }
}
