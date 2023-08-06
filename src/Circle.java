/**
 * Класс для геометрической фигуры круг
 */
public class Circle extends Shape implements IShape {
    /**
     * Поле класса радиус круга
     */
    private double radius;

    /**
     * Конструктор класса
     *
     * @param radius для круга с определённым радиусом
     */
    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть больше ноля");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
