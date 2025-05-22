package org.chess.contract;

import java.util.*;

public interface ChessPiece {
    List<String> getValidMoves(String position);
}