package shapes;

public class Rectangle extends Shape {

    private double width, lenght;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return lenght * width;
    }

    public double getPerimeter() {
        return 2 * (lenght + width);
    }

}
