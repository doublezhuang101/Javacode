public class Circle {
    private double radius;
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public  Circle()
    {
    }
    public Circle(double x)
    {
        double tmp=x;
        setRadius(tmp);
    }
    public static void compareCircle(Circle c1,Circle c2)
    {
        Circle temp1=c1;
        Circle temp2=c2;
        if (temp1.getRadius()>temp2.getRadius())
            System.out.println("圆1比较大");
        else
            System.out.println("圆2比较大");
    }

    public static void main(String[] args)
    {
        Circle a1=new Circle(5);
        Circle a2=new Circle(8);
        compareCircle(a1,a2);

    }
}
