package shapePack;

public class Square extends Rectangle {
    public void printSquare() {
        System.out.println("This is Square. Subclass of Rectangle");
    }

    @Override
    public void calculateArea(double l, double b) {
        // If the two numbers passed are the same, it's a Square calculation
        if (l == b) {
            double area = l * b;
            System.out.println("RESULT: Area of Square= " + area);
        } else {
            // If they are different, we use the Rectangle logic from the parent class
            super.calculateArea(l, b);
        }
    }
}