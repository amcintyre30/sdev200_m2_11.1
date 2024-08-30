/**
 * Author: Aubrie McIntyre
 * Date: 8/30/2024
 * Description: This program is meant to produce the area and perimeter of a triangle.
 */
abstract class Triangles extends GeometricObject{

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }

    Triangles() {
        super();
        System.out.println("Constructor Worked");
    }

    Triangles(double s1, double s2, double s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    public double getArea(double s1, double s2, double s3) {
        double s = (s1 + s2 + s3)/2;
        double subtraction1 = s - s1;
        double subtraction2 = s - s2;
        double subtraction3 = s - s3;
        double results = s * subtraction1 * subtraction2 * subtraction3;
        double area = Math.sqrt(results);
        return area;
    }

    public double getPerimeter(double s1, double s2, double s3) {
        double perimeter = s1 + s2 + s3;
        return perimeter;
    }

    public static void main(String[] args) {
        GeometricObject triangle = new Triangles(2, 2, 2);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }

}