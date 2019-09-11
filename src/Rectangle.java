public class Rectangle {
    private double length=2.0;
    private double width=3.0;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void area()
    {
        double tmp=0.0;
        double length1=getLength();
        double width1=getWidth();
        tmp=length1*width1;
        System.out.println("矩形的面积为"+tmp);
    }
}
