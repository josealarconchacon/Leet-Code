public class Honda extends Vehicle{
    // implementation of abstract method
    @Override
    public String carDescription(String color, String make, String model, String cost) {
        return "Color: " + color + " \n" +
                "Make: " + make + " \n" +
                "Model: " + model + " \n" +
                "Cost: " + color;
    }
}
