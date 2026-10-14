import java.util.Comparator;

public class AreaComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape first, Shape second) {
        return Double.compare(first.calcArea(), second.calcArea());
    }
}
