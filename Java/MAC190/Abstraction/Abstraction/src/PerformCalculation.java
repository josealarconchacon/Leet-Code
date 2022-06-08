public class PerformCalculation extends Calculator{
    // implementation of abstract method
    @Override
    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int subtract(int n1, int n2) {
        return n1 - n2;
    }

    @Override
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    @Override
    public int divide(int n1, int n2) {
        return n1 / n2;
    }
}
