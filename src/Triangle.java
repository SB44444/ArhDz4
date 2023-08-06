/**
 * Класс для геометрической фигуры треугольник
 * a+b>c, a+c>b, b+c>a, (a>0, b>0, c>0),
 */
public class Triangle extends Shape implements IShape {
    /**
     * Поля класса длинны сторон треугольника
     */
    private double side1;
    private double side2;
    private double side3;

    /**
     * Конструктор класса для треугольника с заданными сторонами
     *
     * @param side1
     * @param side2
     * @param side3
     */
    public Triangle(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalArgumentException("Стороны треугольника должны быть больше ноля");
        }
        // Треугольник существует тогда и только тогда, когда сумма любых двух его сторон больше третьей стороны
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            throw new IllegalArgumentException("Треугольник с такими сторонами не существует");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}