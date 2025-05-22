package org.chess.util;

public class BoardUtils {
    static final int SIZE = 8;
    static final char[] COLUMNS = {'A','B','C','D','E','F','G','H'};

    public static boolean isValidPosition(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE;
    }

    public static String toCell(int row, int col) {
        return COLUMNS[col] + String.valueOf(SIZE - row);
    }

    public static int[] fromCell(String cell) {
        int col = cell.charAt(0) - 'A';
        int row = SIZE - Character.getNumericValue(cell.charAt(1));
        return new int[]{row, col};
    }
}
