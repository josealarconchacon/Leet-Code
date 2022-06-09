public class Desk extends Furniture {

    @Override
    boolean equal(Furniture f1) throws Exception {
        return this.getHeight() == f1.getHeight() && this.getLength() == f1.getLength() && this.getWidth() == f1.getWidth() &&
                this.getNumberOfLegs() == f1.getNumberOfLegs() &&
                this.getNumberOfDrawers() == f1.getNumberOfDrawers() &&
                this.getYearItWasBuilt() == f1.getYearItWasBuilt() && this.getMaker().equals(f1.getMaker());
    }

    @Override
    Furniture resize(double f) throws Exception {
        Furniture furniture = (Furniture)this.clone();
        furniture.Height *= f;
        furniture.Length *= f;
        furniture.Width *= f;
        return furniture;
    }

    public Desk() throws Exception {
        super();
    }

    public Desk(double height, double length, double width, int numberOfLegs, int numberOfDrawers, int yearItWasBuilt, String maker) throws Exception {
        super(height, length, width, numberOfLegs, numberOfDrawers, yearItWasBuilt, maker);
        if(height < 28 || height > 32 || length < 24 || length > 60 || width < 16 || width > 30) {
            throw new Exception("Inputs don’t fall within those measurements");
        }
    }
}

