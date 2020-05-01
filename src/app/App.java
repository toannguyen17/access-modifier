package app;

public class App {
    public static void main(String[] args) throws Exception {
        Circle c = new Circle();
        System.out.println("Radius: " + c.getRadius() + ", Area: " + c.getArea());

        // set
        c.setRadius(3.6);
        System.out.println("Radius: " + c.getRadius() + ", Area: " + c.getArea());
    }
}
