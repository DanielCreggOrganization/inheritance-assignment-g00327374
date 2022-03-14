package ie.gmit.twodshapes;

// Super class
public class TwoDShape {
    
    // Instance Variables
    private float widthCm;
    private float heightCm;

    // Parameterized Constructor
    public TwoDShape(float widthCm, float heightCm) {
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    // Getters
    public float getWidthCm()
    {
        return this.widthCm;
    }

    public float getHeightCm() {
        return this.heightCm;
    }

    // Setters
    public void setWidthCm(float widthCm) {
        this.widthCm = widthCm;
    }

    public void setHeightCm(float heightCm) {
        this.heightCm = heightCm;
    }
}
