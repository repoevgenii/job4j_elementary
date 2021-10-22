package ru.job4j.condition;

public class Point {
//1. Создайте класс ru.job4j.condition.Point. Допишите метод distance.
//2. Доработайте метод main. Нужно добавить в него вызов метода distance с различными аргументами.
    //1. Вычесть аргументы x2 и x1.
    //
    //2. Вычесть аргументы y2 и y1.
    //
    //3. Возвести в степень 2 результат операции 1.
    //
    //4. Возвести в степень 2 результат операции 2.
    //
    //5. Сложить результаты операций 3 и 4.
    //
    //6. Вычислить корень квадратный из результата операции 5.

        public static double distance(int x1, int y1, int x2, int y2) {
            double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            return rsl;
        }

        public static void main(String[] args) {
            double result = Point.distance(10, 47, 24, 69);
            System.out.println("result (10, 47) to (24, 69) " + result);
        }
}
