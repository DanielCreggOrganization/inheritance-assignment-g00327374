import ie.gmit.animal.*;
import ie.gmit.twodshapes.*;

public class Main {
    public static void main(String[] args) {
        
        // Create Objects
        Triangle triangleObjOne = new Triangle(10.0f, 5.0f, "Scalene");
        ColouredTriangle colObjOne = new ColouredTriangle(20.0f, 10.0f, "Isosceles", "Red");
        Circle circleObjOne = new Circle(3.3f, 4.4f, 5.5f);

        // Calling my methods
        // triangleObjOne.setWidthCm(10);
        // triangleObjOne.setHeightCm(10);
        // colObjOne.setHeightCm(20.5f);
        // circleObjOne.setWidthCm(11.1f);
        
        // Display
        System.out.println(triangleObjOne.getWidthCm() + " " + triangleObjOne.getHeightCm());
        System.out.println(colObjOne.getHeightCm());
        System.out.println("Radius = " + circleObjOne.findRadius());
    }

} // End class