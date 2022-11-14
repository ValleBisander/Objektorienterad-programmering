package exercises.ex7usemoreclasses;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*

  A class for points in 3D. Should be immutable

  NOTE: No IO here, this is just the logical concept.

  To test run Ex2TestPointTriangle

*/
public class Point {

  int x;
  int y;
  int z;
  Point p;
    
  public Point(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z; 
  }

  public Point(Point p) {
    this.x = p.getX();
    this.y = p.getY();
    this.z = p.getZ();
  }

  double distance(Point p) {
    
    double d = sqrt((pow((this.getX() - p.getX()), 2)) + 
    (pow((this.getY() - p.getY()), 2)) + (pow((this.getZ() - p.getZ()), 2)));

    return d;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getZ() {
    return z;
  }
  
}


