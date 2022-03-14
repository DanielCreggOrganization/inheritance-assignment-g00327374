package ie.gmit.twodshapes;

public class Triangle extends TwoDShape {
    
      // Instance Varibales
      private String sideType;

    // Parameterized Constructor
    public Triangle(float widthCm, float heightCm, String sideType) {
        super(widthCm, heightCm);
        this.sideType = sideType;
    }

    public String getSideType() {
        return this.sideType;
    }

    public void setSideType(String sideType) {
        this.sideType = sideType;
    }

    
}
