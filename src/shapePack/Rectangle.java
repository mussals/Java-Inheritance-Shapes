package shapePack;

public class Rectangle extends Shape {
    public void printRectangle() {
        System.out.println("This is Rectangle. Subclass of Shape");
    }
    
 // Method to be overridden
    public void calculateArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("RESULT: Area of Rectangle= " + area);
    }
}