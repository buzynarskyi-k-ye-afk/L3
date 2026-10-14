public class ShapeView {

    public void printMenu() {
        System.out.println();
        System.out.println("Меню:");
        System.out.println("1 - показати всі фігури");
        System.out.println("2 - сумарна площа всіх фігур");
        System.out.println("3 - сумарна площа фігур заданого виду");
        System.out.println("4 - сортувати за зростанням площі");
        System.out.println("5 - сортувати за кольором");
        System.out.println("0 - вихід");
        System.out.print("Ваш вибір: ");
    }

    public void printTypeMenu() {
        System.out.println("Оберіть вид фігури:");
        System.out.println("1 - коло, 2 - прямокутник, 3 - трикутник, 4 - випадковий вид");
        System.out.print("Ваш вибір: ");
    }

    public void printShapes(String title, Shape[] shapes) {
        System.out.println(title);
        for (Shape s : shapes) {
            s.draw();
        }
    }

    public void printTotalArea(double area) {
        System.out.printf("Сумарна площа всіх фігур: %.2f%n", area);
    }

    public void printAreaByType(String typeName, double area) {
        System.out.printf("Сумарна площа фігур виду %s: %.2f%n", typeName, area);
    }

    public void printMessage(String text) {
        System.out.println(text);
    }
}
