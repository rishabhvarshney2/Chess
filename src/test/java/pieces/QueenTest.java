package pieces;

import org.chess.pieces.Queen;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueenTest {

    @Test
    void testQueenMovesFromCenter() {
        Queen queen = new Queen();
        List<String> moves = queen.getValidMoves("D4");

        assertEquals(27, moves.size());
        assertTrue(moves.contains("A4"));
        assertTrue(moves.contains("D1"));
        assertTrue(moves.contains("H4"));
        assertTrue(moves.contains("D8"));
        assertTrue(moves.contains("A1"));
        assertTrue(moves.contains("G7"));
    }

    @Test
    void testQueenMovesFromCornerA1() {
        Queen queen = new Queen();
        List<String> moves = queen.getValidMoves("A1");

        assertEquals(21, moves.size());
        assertTrue(moves.contains("B1"));
        assertTrue(moves.contains("A2"));
        assertTrue(moves.contains("B2"));
        assertTrue(moves.contains("H1"));
        assertTrue(moves.contains("A8"));
        assertTrue(moves.contains("H8"));
    }

    @Test
    void testQueenMovesFromEdgeH4() {
        Queen queen = new Queen();
        List<String> moves = queen.getValidMoves("H4");

        assertEquals(21, moves.size());
        assertTrue(moves.contains("A4"));
        assertTrue(moves.contains("H1"));
        assertTrue(moves.contains("G3"));
        assertTrue(moves.contains("B4"));
    }
    
}

