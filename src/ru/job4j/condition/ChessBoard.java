package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 >= 0 && y1 >= 0 && x2 >= 0 && y2 >= 0) {
            int xAbs = Math.abs(x1 - x2);
            int yAbs = Math.abs(y1 - y2);
            if (xAbs == yAbs) {
                rsl = xAbs;
            }
        }
            return rsl;

    }

    public static void main(String[] args) {
        System.out.println(way(6, 3, 3, 0));
        System.out.println(way(6, 7, 1, 2));
        System.out.println(way(7, 0, 0, 7));
        System.out.println(way(-1, 6, 4, 1));
        System.out.println(way(2, 6, 4, 10));

    }
}