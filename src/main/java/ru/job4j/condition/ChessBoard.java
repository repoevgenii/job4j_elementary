package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int zero = 0;
        int seven = 7;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)
                && (x1 >= zero) && (x2 >= zero) && (y1 >= zero) && (y2 >= zero)
                && (x1 <= seven) && (x2 <= seven) && (y1 <= seven) && (y2 <= seven)) {
            return Math.abs(x2 - x1);
        }
        return 0;
    }
}
