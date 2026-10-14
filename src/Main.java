public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("red", 3),
                new Rectangle("blue", 4, 5),
                new Triangle("green", 6, 3),
                new Circle("yellow", 1.5),
                new Rectangle("black", 2, 7),
                new Triangle("white", 10, 4),
                new Circle("blue", 2),
                new Rectangle("red", 3, 3),
                new Triangle("yellow", 5, 5),
                new Circle("green", 4),
                new Rectangle("white", 6, 1.5),
                new Triangle("black", 8, 2)
        };

        ShapeModel model = new ShapeModel(shapes);
        ShapeView view = new ShapeView();
        ShapeController controller = new ShapeController(model, view);
        controller.run();
    }
}
