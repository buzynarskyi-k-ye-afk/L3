/* основа для всіх shapes, містить колір і реалізує Drawable.java (виводить текст "фігура: ..."),
   а також виводить інший текст інформації про фігуру (колір, площа)*/

public abstract class Shape implements Drawable {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public abstract double calcArea();

    @Override
    public void draw() {
        System.out.println("Фігура: " + this);
    }

    @Override
    public String toString() {
        return "колір: " + shapeColor + ", площа: " + String.format("%.2f", calcArea());
    }
}
