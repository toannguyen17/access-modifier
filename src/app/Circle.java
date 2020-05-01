package app;

public class Circle {
    private double radius = 1.0;
    private String color  = "red";
    
    Circle(){
    }

    Circle(double radius) {
        this.radius = radius;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
