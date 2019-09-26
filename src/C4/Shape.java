class Rect extends Shape {
    int area(int length, int heigth) {
        return length*heigth;
    }
}
class Triangle extends Shape {
    int area(int length, int heigth) {
        return (length * heigth) / 2;
    }
}
public abstract class Shape {
    int length;
    int heigth;
    abstract int area(int length,int heigth);
    public static void main(String[] args) {
        Triangle c = new Triangle ();
        System.out.println("三角形面积:" + c.area(10, 6));
        Rect d = new Rect ();
        System.out.println("长方形面积:" + d.area(8, 9));
    }

}
