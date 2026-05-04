package shapeProcess;

import shapePack.*; // Import classes from the other package
import java.util.Scanner;
public class ShapeExecute {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        // Creating the Square object
        Square sq = new Square();
        sq.printShape();      // From Shape
        sq.printRectangle();  // From Rectangle
        sq.printSquare();     // From Square
        
        System.out.println("----");
        
     // 2. Area of Square
        System.out.println("Area of Square");
        System.out.print("Enter the measure of a side: ");
        double side = input.nextDouble();
        sq.calculateArea(side, side); // Calls the Overridden method in Square
        System.out.println();

        // 3. Area of Rectangle
        System.out.println("Area of Rectangle:");
        System.out.print("Enter the measure of length: ");
        double l = input.nextDouble();
        System.out.print("Enter the measure of breadth: ");
        double b = input.nextDouble();
        
        // To call the Rectangle version using the square object, 
        // we use the logic defined in the parent class
        sq.calculateArea(l, b);
        
        System.out.println("\n----");
        
        // Creating the SemiCircle object
        SemiCircle sc = new SemiCircle();
        sc.printShape();      // From Shape
        sc.printSemiCircle(); // From SemiCircle
        sc.printCircle();     // From Circle
        
        input.close();
    }
}
