//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------Shape class test------------------");
        // 1
        // Using the default constructor
        Shape shape1 = new Shape();
        // Print the result using toString
        System.out.println("----------------------Shape 1----------------------\n" + shape1.toString());

        // 2
        // Using the other constructor
        Shape shape2 = new Shape("purple", false);
        // Print the result using getter
        System.out.println("----------------------Shape 2----------------------\n"
                + "The shape color: " + shape2.getColor()
                + "\nIs filled? " + shape2.isFilled());

        //###############################################################################################
        System.out.println("-----------------Circle class test------------------");
        // 1
        // Using the constructor with the super class attributes
        Circle circle1 = new Circle(5.0,"pink",true);
        // Print the result using toString
        System.out.println("----------------------Circle 1----------------------\n" + circle1.toString());

        // 2
        // Using the other constructor
        Circle circle2 = new Circle(6.7);
        // Change the radius
        circle2.setRadius(9.6);
        // Print the result using getter
        System.out.println("----------------------Circle 2----------------------\n"
                + "Circle radius: " + circle1.getRadius()
                + "\nThe area of the circle: " + circle1.getArea()
                + "\nThe perimeter of the circle: " + circle1.getPerimeter());


        //###############################################################################################
        System.out.println("----------------Rectangle class test----------------");
        // 1
        // Using the constructor with the super class attributes
        Rectangle rectangle1 = new Rectangle(50.0, 40.0,"brown",false);
        // Print the result using toString
        System.out.println("---------------------Rectangle 1--------------------\n" + rectangle1.toString());

        // 2
        // Using the other constructor
        Rectangle rectangle2 = new Rectangle(70.0, 30.0);
        // Change the length & width
        rectangle2.setLength(50.0);
        rectangle2.setWidth(100.0);
        // Print the result using getter
        System.out.println("---------------------Rectangle 2--------------------\n"
                + "Rectangle width: " + rectangle2.getWidth()
                + "\nRectangle length: " + rectangle2.getLength()
                + "\nThe area of the rectangle: " + rectangle2.getArea()
                + "\nThe perimeter of the rectangle: " + rectangle2.getPerimeter());

        //###############################################################################################
        System.out.println("-----------------Square class test------------------");
        // 1
        // Using the constructor with the super class attributes
        Square square1 = new Square(70.0,"brown",false);
        // Print the result using toString
        System.out.println("----------------------Square 1----------------------\n" + square1.toString());

        // 2
        // Using the other constructor
        Square square2 = new Square(10.0);
        // Change the side
        square2.setSide(50.0);
        // Print the result using getter
        System.out.println("----------------------Square 2----------------------\n"
                + "The side of the square: " + square2.getSide()
                + "\nThe area of the square: " + square2.getArea()
                + "\nThe perimeter of the square: " + square2.getPerimeter());

    }
}