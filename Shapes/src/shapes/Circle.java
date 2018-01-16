
package shapes;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2)* Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    
}
