package ru.job4j.condition;

public class Point {

        public static double distance(int x1, int y1, int x2, int y2) {
            double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            return rsl;
        }

        public static void main(String[] args) {
            double result = Point.distance(10, 47, 24, 69);
            System.out.println("result (10, 47) to (24, 69) " + result);
        }
}
