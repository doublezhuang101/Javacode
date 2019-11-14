import java.util.Random;
public class Child {
    public static void main(String[] args) {
        new Childtest().run();
    }
}

class Childtest extends Child{
    private int apple= 10;

    public void run() {
        while (true) {
            if (apple != 0) {
                Random r = new Random();
                int tmp=r.nextInt(8);
                System.out.println(Thread.currentThread().getName() + " 吃了第 " + (apple-tmp) + " 个苹果");
            } else {
                break;
            }
        }
    }
}