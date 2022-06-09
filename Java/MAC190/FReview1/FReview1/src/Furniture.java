 public abstract class Furniture {
    double Height;
     double Length;
     double Width;
    private int NumberOfLegs, NumberOfDrawers, YearItWasBuilt;
    private String Maker;
    abstract boolean equal(Furniture f1) throws Exception;
    abstract Furniture resize(double f) throws Exception;

     // Constructor
    public Furniture() throws Exception{
        this(0.0, 0.0, 0.0, 0, 0, 0000, "Default Company");
    }
    public Furniture(double height, double length, double width, int numberOfLegs, int numberOfDrawers, int yearItWasBuilt, String maker) throws Exception{
        if(length < 0 || height < 0 || width < 0) {
            throw new Exception("Height don’t fall within those measurements");
        }
        this.Height = height;
        this.Length = length;
        this.Width = width;
        this.NumberOfLegs = numberOfLegs;
        this.NumberOfDrawers = numberOfDrawers;
        this.YearItWasBuilt = yearItWasBuilt;
        this.Maker = maker;
    }

    public String toString() {
        return " Height: " + this.Height + " \n" +
                "Length: " + this.Length + " \n" +
                "Width: " + this.Width + " \n" +
                "Number of Legs: " + this.NumberOfLegs + " \n" +
                "Number of Drawers: " + this.NumberOfDrawers + " \n" +
                "Year It Was Built: " + this.YearItWasBuilt + " \n" +
                "Maker: " + this.Maker;
    }

    // getters and setters
    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        Length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public int getNumberOfLegs() {
        return NumberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        NumberOfLegs = numberOfLegs;
    }

    public int getNumberOfDrawers() {
        return NumberOfDrawers;
    }

    public void setNumberOfDrawers(int numberOfDrawers) {
        NumberOfDrawers = numberOfDrawers;
    }

    public int getYearItWasBuilt() {
        return YearItWasBuilt;
    }

    public void setYearItWasBuilt(int yearItWasBuilt) {
        YearItWasBuilt = yearItWasBuilt;
    }

    public String getMaker() {
        return Maker;
    }

    public void setMaker(String maker) {
        Maker = maker;
    }
}
