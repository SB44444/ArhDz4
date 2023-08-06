/**
 * Главный класс приложения
 * Оборачиваем каждый класс в свой Exception, чтобы сохранить низкую взаимозависимость
 */
public class GeometryApp {
    public static void main(String[] args) {
        // Пример использования конкретных классов геометрических фигур
        try {

            Circle circle = new Circle(5.0);
            System.out.println("Площадь круга: " + circle.getArea());
            System.out.println("Периметр круга: " + circle.getPerimeter());
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка данных круга: " + e.getMessage());
        }
        try {

            Rectangle rectangle = new Rectangle(4.0, 6.0);
            System.out.println("Площадь прямоугольника: " + rectangle.getArea());
            System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка данных прямоугольника: " + e.getMessage());
        }
        try {

            Triangle triangle = new Triangle(3.0, 4.0, 5.0);
            System.out.println("Площадь треугольника: " + triangle.getArea());
            System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка данных треугольника: " + e.getMessage());
        }
    }
}
