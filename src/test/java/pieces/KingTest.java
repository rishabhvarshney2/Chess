package pieces;

import org.chess.pieces.King;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KingTest {

    @Test
    void testKingMovesFromCenter() {
        King king = new King();
        List<String> moves = king.getValidMoves("D4");

        assertEquals(8, moves.size());
        assertTrue(moves.contains("C3"));
        assertTrue(moves.contains("C4"));
        assertTrue(moves.contains("C5"));
        assertTrue(moves.contains("D3"));
        assertTrue(moves.contains("D5"));
        assertTrue(moves.contains("E3"));
        assertTrue(moves.contains("E4"));
        assertTrue(moves.contains("E5"));
    }

    @Test
    void testKingMovesFromCornerA1() {
        King king = new King();
        List<String> moves = king.getValidMoves("A1");

        assertEquals(3, moves.size());
        assertTrue(moves.contains("A2"));
        assertTrue(moves.contains("B1"));
        assertTrue(moves.contains("B2"));
    }

    @Test
    void testKingMovesFromEdgeH5() {
        King king = new King();
        List<String> moves = king.getValidMoves("H5");

        assertEquals(5, moves.size());
        assertTrue(moves.contains("G4"));
        assertTrue(moves.contains("G5"));
        assertTrue(moves.contains("G6"));
        assertTrue(moves.contains("H4"));
        assertTrue(moves.contains("H6"));
    }

}

