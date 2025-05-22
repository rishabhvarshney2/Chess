package org.chess.pieces;

import org.chess.contract.ChessPiece;
import org.chess.util.BoardUtils;

import java.util.ArrayList;
import java.util.List;

public class King implements ChessPiece {
    private static final int[][] DIRECTIONS = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1},  {1, 0},  {1, 1}
    };

    @Override
    public List<String> getValidMoves(String position) {
        List<String> moves = new ArrayList<>();
        int[] pos = BoardUtils.fromCell(position);
        for (int[] dir : DIRECTIONS) {
            int newRow = pos[0] + dir[0];
            int newCol = pos[1] + dir[1];
            if (BoardUtils.isValidPosition(newRow, newCol)) {
                moves.add(BoardUtils.toCell(newRow, newCol));
            }
        }
        return moves;
    }
}
