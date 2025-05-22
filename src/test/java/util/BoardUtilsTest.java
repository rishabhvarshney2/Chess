package util;

import org.chess.util.BoardUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardUtilsTest {

    @Test
    void testIsValidPosition() {
        assertTrue(BoardUtils.isValidPosition(0, 0));
        assertTrue(BoardUtils.isValidPosition(7, 7));
        assertFalse(BoardUtils.isValidPosition(-1, 5));
        assertFalse(BoardUtils.isValidPosition(8, 0));
        assertFalse(BoardUtils.isValidPosition(4, 8));
    }

    @Test
    void testToCell() {
        assertEquals("A8", BoardUtils.toCell(0, 0));
        assertEquals("H1", BoardUtils.toCell(7, 7));
        assertEquals("D5", BoardUtils.toCell(3, 3));
    }

    @Test
    void testFromCell() {
        assertArrayEquals(new int[]{0, 0}, BoardUtils.fromCell("A8"));
        assertArrayEquals(new int[]{7, 7}, BoardUtils.fromCell("H1"));
        assertArrayEquals(new int[]{3, 3}, BoardUtils.fromCell("D5"));
    }

    @Test
    void testRoundTripConversion() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                String cell = BoardUtils.toCell(row, col);
                int[] result = BoardUtils.fromCell(cell);
                assertEquals(row, result[0]);
                assertEquals(col, result[1]);
            }
        }
    }
}

