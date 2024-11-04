public class Square extends Rectangle{
    // Constructors
    Square(){
    }

    Square(double side){
        super(side,side);
    }

    Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    // Getter & setter
    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    // Extra methods
    public double getArea(){
        return  getSide() * getSide();
    }

    public double getPerimeter(){
        return 4 *  getSide();
    }

    // toString method
    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of\n" + super.toString();
    }
}
