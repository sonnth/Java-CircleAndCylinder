public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getVolumn() {
        return getRadius() * height;
    }

    @Override
    public String toString() {
        return "A Cyliner with volumn = "+getVolumn()+", which is a subclass of "
                + super.toString();
    }


}
