public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    // Constructors
    Rectangle(){
        width = 1.0;
        length = 1.0;
    }

     Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    // Getter & setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Extra methods
    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * (length + width);
    }

    // toString method
    @Override
    public String toString() {
        return "A Rectangle with width = " + width + " and length = " + length + ", which is \na subclass of " + super.toString();
    }
}
