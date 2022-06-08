
class Main {
    public static void main(String[] args) {
        Car();
        System.out.println("-----------------");
        MyCalculator();
    }

    public static void Car() {
        Honda newHonda = new Honda();
        System.out.println(newHonda.carDescription("Red","Honda","Civic","23000"));
    }

    public static void MyCalculator() {
        PerformCalculation Cal = new PerformCalculation();
        System.out.println("Sum: " + Cal.sum(3,5) + " \n" +
                "Subtract: " + Cal.subtract(23,12) + " \n" +
                "Multiply: " + Cal.multiply(22,2) + " \n" +
                "Divide: " + Cal.divide(100,5));
    }
}
