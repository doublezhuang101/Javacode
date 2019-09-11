public class Square {
    int sides;
    public Square(int x)
    {
        sides=x;
    }
    public void Count_area()
    {
        int area=0;
        area=sides*sides;
        System.out.println("面积为"+area);
    }
    public void Count_Perimeter()
    {
        int tmp=0;
        tmp=sides*4;
        System.out.println("周长为"+tmp);
    }

    public static void main(String[] args) {
        Square a=new Square(4);
        a.Count_area();
        a.Count_Perimeter();

    }
}
