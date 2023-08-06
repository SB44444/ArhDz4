/**
 * Класс для геометрической фигуры прямоугольник
 */
public class Rectangle extends Shape implements IShape {
    /**
     * Поля класса длинна (length) и ширина (width) прямоугольника
     */
    private double length;
    private double width;

    /**
     * Конструктор класса
     *
     * @param length для прямоугольника с заданной длинной
     * @param width  для прямоугольника с заданной шириной
     */
    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Длина и ширина прямоугольника должны быть быть больше ноля");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
