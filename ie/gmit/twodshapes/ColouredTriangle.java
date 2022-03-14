package ie.gmit.twodshapes;

// Multi-level inheritence
public class ColouredTriangle extends Triangle{

    private String colour;

    // Getters
    public String getColour() {
        return this.colour;
    }

    // Setters
    public void setColour(String colour) {
        this.colour = colour;
    }

    // calling constructor from Triangle
    public ColouredTriangle(float widthCm, float heightCm, String sideType, String colour) {
        super(widthCm, heightCm, sideType);
        this.colour = colour;
    }
    
}
