/**
 * Интерфейс для геометрических фигур
 * Реализация через интерфейс (высокой сплоченности или низкая взаимозависимость)
 * означает, что интерфейс выдвигает контракт для любого класса, который его реализует,
 * но каждый класс имеет право реализовать методы по-своему,
 * и изменения в методе, объявленном в одном классе, не влияют ни на какой другой класс
 */
public interface IShape {
    /**
     * Метод расчёта площади геометрической фигуры
     * @return площадь фигуры типом данных double
     */
     double getArea();

    /**
     * Метод расчёта площади геометрической периметра фигуры
     * @return периметр фигуры типом данных double
     */
    abstract double getPerimeter();
}