import java.util.Comparator;

public class ColorComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape first, Shape second) {
        return first.getShapeColor().compareTo(second.getShapeColor());
    }
}
