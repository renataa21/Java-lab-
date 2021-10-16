import java.lang.*;
public class ShapeTester{
    public static void main(String[] args) {
        Shape s1 = new Circle( "RED", false, 5.5d);  // Upcast Circle to Shape
        System.out.println(s1);                    // which version?
        System.out.println(s1.getAria());          // which version?
        System.out.println(s1.getParameter());     // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle) s1).getRadius());

        Circle c1 = (Circle)s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getAria());
        System.out.println(c1.getParameter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape();

        Shape s3 = new Rectangle( "RED", false, 1.0d, 2.0d);   // Upcast
        System.out.println(s3);
        System.out.println(s3.getAria());
        System.out.println(s3.getParameter());
        System.out.println(s3.getColor());
        System.out.println(((Rectangle) s3).getLength());

        Rectangle r1 = (Rectangle)s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getAria());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getAria());
        System.out.println(s4.getColor());
        System.out.println(((Square) s4).getSite());
        // Take note that we downcast Shape s4 to Rectangle,
        //  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getAria());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSite());
        System.out.println(r2.getLength());

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getAria());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSite());
        System.out.println(sq1.getLength());
    }

}


