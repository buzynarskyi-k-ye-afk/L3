import java.util.Random;
import java.util.Scanner;

public class ShapeController {
    private ShapeModel model;
    private ShapeView view;
    private Scanner scanner = new Scanner(System.in);

    public ShapeController(ShapeModel model, ShapeView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        view.printShapes("Початковий набір фігур:", model.getShapes());

        while (true) {
            view.printMenu();
            String choice = scanner.nextLine().trim();

            if (choice.equals("1")) {
                view.printShapes("Набір фігур:", model.getShapes());
            } else if (choice.equals("2")) {
                view.printTotalArea(model.getTotalArea());
            } else if (choice.equals("3")) {
                showAreaByType();
            } else if (choice.equals("4")) {
                model.sortByArea();
                view.printShapes("Відсортовано за зростанням площі:", model.getShapes());
            } else if (choice.equals("5")) {
                model.sortByColor();
                view.printShapes("Відсортовано за кольором:", model.getShapes());
            } else if (choice.equals("0")) {
                view.printMessage("Завершення програми.");
                return;
            } else {
                view.printMessage("Невідомий пункт меню, спробуйте ще раз.");
            }
        }
    }

    private void showAreaByType() {
        view.printTypeMenu();
        String choice = scanner.nextLine().trim();
        String typeName;

        if (choice.equals("1")) {
            typeName = "Circle";
        } else if (choice.equals("2")) {
            typeName = "Rectangle";
        } else if (choice.equals("3")) {
            typeName = "Triangle";
        } else if (choice.equals("4")) {
            String[] types = {"Circle", "Rectangle", "Triangle"};
            typeName = types[new Random().nextInt(types.length)];
            view.printMessage("Випадково обрано вид: " + typeName);
        } else {
            view.printMessage("Невідомий вид фігури.");
            return;
        }

        if (model.countByType(typeName) == 0) {
            view.printMessage("Фігур виду " + typeName + " не знайдено.");
        } else {
            view.printAreaByType(typeName, model.getTotalAreaByType(typeName));
        }
    }
}
