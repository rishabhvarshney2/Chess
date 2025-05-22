package pieces;

import org.chess.pieces.Pawn;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PawnTest {

    @Test
    void testPawnMoveFromMiddle() {
        Pawn pawn = new Pawn();
        List<String> moves = pawn.getValidMoves("D5");

        assertEquals(1, moves.size());
        assertTrue(moves.contains("D6"));
    }

    @Test
    void testPawnMoveFromSecondRank() {
        Pawn pawn = new Pawn();
        List<String> moves = pawn.getValidMoves("E2");

        assertEquals(1, moves.size());
        assertTrue(moves.contains("E3"));
    }

    @Test
    void testPawnMoveFromFirstRank() {
        Pawn pawn = new Pawn();
        List<String> moves = pawn.getValidMoves("H1");

        assertEquals(1, moves.size());
        assertTrue(moves.contains("H2"));
    }

    @Test
    void testPawnMoveFromEighthRank() {
        Pawn pawn = new Pawn();
        List<String> moves = pawn.getValidMoves("B8");

        assertTrue(moves.isEmpty());
    }

}
