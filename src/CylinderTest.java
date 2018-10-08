import com.sun.deploy.util.BlackList;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(1.5, 1.5, "Black");
        System.out.println(cylinder);
    }
}
