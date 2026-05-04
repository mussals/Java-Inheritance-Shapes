package shapePack;

public class Square extends Rectangle {
    public void printSquare() {
        System.out.println("This is Square. Subclass of Rectangle");
    }
    
 // Overriding the Rectangle method
    @Override
    public void calculateArea(double side, double sameSide) {
        double area = side * side;
        System.out.println("RESULT: Area of Square= " + area);
    }
}