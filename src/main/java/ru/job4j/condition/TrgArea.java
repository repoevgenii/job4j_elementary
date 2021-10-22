package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double halfPerimeter = (a + b + c) / 2;
        double rsl = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
