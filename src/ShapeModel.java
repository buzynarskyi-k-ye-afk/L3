import java.util.Arrays;

public class ShapeModel {
    private Shape[] shapes;

    public ShapeModel(Shape[] shapes) {
        this.shapes = shapes;
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public double getTotalArea() {
        double sum = 0;
        for (Shape s : shapes) {
            sum += s.calcArea();
        }
        return sum;
    }

    public int countByType(String typeName) {
        int count = 0;
        for (Shape s : shapes) {
            if (s.getClass().getSimpleName().equals(typeName)) {
                count++;
            }
        }
        return count;
    }

    public double getTotalAreaByType(String typeName) {
        double sum = 0;
        for (Shape s : shapes) {
            if (s.getClass().getSimpleName().equals(typeName)) {
                sum += s.calcArea();
            }
        }
        return sum;
    }

    public void sortByArea() {
        Arrays.sort(shapes, new AreaComparator());
    }

    public void sortByColor() {
        Arrays.sort(shapes, new ColorComparator());
    }
}
