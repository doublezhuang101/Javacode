class Circle extends Point{
    public int rad=1;
    public double area(){
        return (rad*rad*PI);
    }
    public void show(){
        System.out.println("rad="+rad+",area="+area());
    }
}
class Cylinder extends Circle{
    public int height=3;
    public double vol(){
        return (height*area());
    }
    public void show() {
        System.out.println("height="+height+",vol="+vol());
    }
}
public class Point {
    final double PI=3.14;
    public int x;
    public int y;
    public void show(){
        System.out.println("x="+x+",y="+y);
    }
    Point(){
        x=1;
        y=2;
    }
    public static void main(String[] args) {
        Point P1=new Point();
        Circle P2=new Circle();
        Cylinder P3=new Cylinder();
        P1.show();
        P2.show();
        P3.show();
    }
}
