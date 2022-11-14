package exercises.ex7usemoreclasses;

import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

import static java.lang.Math.sqrt;

/*
      A class for a Triangle in 3D
      Should use Point class and Herons formula

      NOTE: No IO here, this is just the logical concept.

      To test run Ex2TestPointTriangle

*/
public class Triangle {

    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c){
        
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double side1 = a.distance(b);
        double side2 = b.distance(c);
        double side3 = c.distance(a);

        double s = ((side1 + side2 + side3) / 2);

        double a = sqrt(s * (s-side1) * (s - side2) * (s - side3));
        
        return a;
    }

    public Boolean equals(Triangle t){
        
        if (this.a == t.a && this.b == t.b && this.c == t.c){
            return true;
        }
        else {
            return false;
        }
    }

}

