package shapeProcess;

import shapePack.*; // Import classes from the other package

public class ShapeExecute {
    public static void main(String[] args) {
        
        // Creating the Square object
        Square sq = new Square();
        sq.printShape();      // From Shape
        sq.printRectangle();  // From Rectangle
        sq.printSquare();     // From Square
        
        System.out.println("----");
        
        // Creating the SemiCircle object
        SemiCircle sc = new SemiCircle();
        sc.printShape();      // From Shape
        sc.printSemiCircle(); // From SemiCircle
        sc.printCircle();     // From Circle
    }
}
