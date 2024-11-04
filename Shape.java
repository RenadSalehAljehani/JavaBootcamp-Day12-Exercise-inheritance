public class Shape {

    private String color;
    private boolean filled;

    // Constructors
    Shape(){
        color = "green";
        filled = true;
    }

    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    // Getter & setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // toString method
    @Override
    public String toString() {

        if(isFilled()){
            return "A Shape with color of " + color + " and filled.";
        }else {
            return "A Shape with color of " + color + " and not filled.";
        }
    }
}
