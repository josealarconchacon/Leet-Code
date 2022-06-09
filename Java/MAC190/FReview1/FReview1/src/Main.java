public class Main {
    public static void main(String[] args) throws Exception {

        Desk D = new Desk();
        try {
            // Default Dest;
            System.out.println("D:" + D);
            System.out.println("-----------------------'");
            D.setHeight(28.0);
            D.setLength(50);
            D.setWidth(25);
            D.setNumberOfDrawers(6);
            D.setNumberOfLegs(4);
            D.setMaker("The Wood Company");
            D.setYearItWasBuilt(2012);
            System.out.println("Built the Desk: " + D);
        }catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("----------------------------------------------");
    }
}
